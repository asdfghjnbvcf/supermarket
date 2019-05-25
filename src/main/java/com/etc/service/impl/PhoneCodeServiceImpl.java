package com.etc.service.impl;

import com.etc.dao.PhoneCodeDao;
import com.etc.entity.PhoneCode;
import com.etc.service.PhoneCodeService;
import com.etc.utils.SmsSDKUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;
/*
 * 文件名：com.etc.service.impl.PhoneCodeServiceImpl
 * 描述：短信验证码操作的service接口实现类
 * 作者：黄志鹏
 * 时间：2019-5-24 15:07:57
 */

@Service
public class PhoneCodeServiceImpl implements PhoneCodeService {
    @Resource
    private PhoneCodeDao phoneCodeDao;

    @Override
    public void sendCodeAndDeleteCode(String phone) {
        //创建一个随机数对象
        Random random = new Random();

        //产生六位数的随机数字符串
        String code = "" + random.nextInt(9) + random.nextInt(9) + random.nextInt(9) +
                random.nextInt(9) + random.nextInt(9) + random.nextInt(9);

        //调用发送短信的方法
        boolean flag = SmsSDKUtil.SendSms(phone, code);
        if (flag) {
            //短信发送成功，将发送的数据暂存数据库
            PhoneCode phoneCode = new PhoneCode(phone, code);
            //调用添加验证码信息的方法
            phoneCodeDao.savePhoneCode(phoneCode);
        }
        try {
            //设置三分钟休眠，三分钟后如果短信验证码信息还存在将其删除
            Thread.sleep(180000);
            //根据手机号查询PhoneCode表中是否还存在该手机号的验证码信息
            PhoneCode phoneCode=phoneCodeDao.selectPhoneCodeByPhoneAndCode(phone,code);

            if(phoneCode!=null) {
                //存在该手机号的验证码信息，将其删除
                phoneCodeDao.deletePhoneCodeByPhone(phone,code);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * 根据手机号及验证码查询验证码信息是否存在的方法
     * @param userPhone
     * @param code 要查询的验证码
     * @return 查询到的结果
     */
    @Override
    public PhoneCode selectPhoneCodeByPhoneAndCode(String userPhone, String code) {
        return phoneCodeDao.selectPhoneCodeByPhoneAndCode(userPhone, code);
    }

    /**
     * 用户注册成功后删除当前注册使用的验证码信息
     * @param userphone 要删除的手机号
     * @param code 要删除的验证码
     */
    @Override
    public void deletePhoneCode(String userphone, String code) {

        //调用phoneCodeDao中的删除验证码信息的方法
        phoneCodeDao.deletePhoneCodeByPhone(userphone,code);
    }
}
