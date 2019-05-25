package com.etc.service;

import com.etc.entity.PhoneCode;

/*
 * 文件名：com.etc.service.PhoneCodeService
 * 描述：短信验证码操作的service接口
 * 作者：黄志鹏
 * 时间：2019-5-24 14:38:49
 */

public interface PhoneCodeService {

    /**
     *向手机号发送短信的方法
     * @param phone 要发送的手机号码
     */
    public void sendCodeAndDeleteCode(String phone);

    /**
     * 根据手机号码以及验证码进行查找数据库中是否存在对象
     * @param phone 要查询的手机号
     * @param code 要查询的验证码
     * @return 查询到的PhoneCode对象
     */
    PhoneCode selectPhoneCodeByPhoneAndCode(String phone, String code);


    void deletePhoneCode(String userphone, String code);
}
