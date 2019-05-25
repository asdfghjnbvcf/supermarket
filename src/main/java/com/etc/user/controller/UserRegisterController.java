package com.etc.user.controller;

import com.etc.entity.PhoneCode;
import com.etc.entity.User;
import com.etc.service.PhoneCodeService;
import com.etc.service.UserService;
import com.etc.utils.CommonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
/*
 * 文件名：com.etc.user.controller.Register
 * 描述：用户注册功能的控制器
 * 作者：黄志鹏
 * 时间：2019-5-23 14:38:29
 */

@Controller
@RequestMapping("user.action")
public class UserRegisterController {

    //注入用户操作的service对象
    @Autowired
    private UserService userService;

    //注入有关手机验证码操作的service对象
    @Autowired
    private PhoneCodeService phoneCodeService;

    /**
     * 注册发送验证码的控制器
     * 接收手机号，发送相应的验证码
     *
     * @param phone 要发送验证码的手机号
     * @return 返回发送成功或者发送失败
     */
    @RequestMapping("sendSms")
    @ResponseBody
    public CommonMessage sendSms(String phone) {

        //创建返回的CommonMessage对象
        CommonMessage commonMessage = new CommonMessage();

        //查询数据库是否存在该手机号码的用户
        User user = userService.getUserByUserPhone(phone);

        if (user != null) {
            //存在该手机号码用户，不发送短信
            commonMessage.setMsg("手机号已被注册，验证码发送失败");
        } else {
            //不存在该手机号用户，调用发短信的service发送短信
            phoneCodeService.sendCodeAndDeleteCode(phone);
            commonMessage.setMsg("验证码已发送，请注意查收");
        }
        return commonMessage;
    }

    /**
     * 注册页面跳转至登录界面的方法
     *
     * @return 登录界面的地址
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        return "user/login";
    }

    /**
     * 注册界面跳转至首页的方法
     *
     * @return 首页的地址
     */
    @RequestMapping("toHome")
    public String toHmoe() {
        return "user/home";
    }

    /**
     * 前台AJAX校验手机号是否已被注册的方法
     *
     * @param userPhone 要校验的手机号
     * @return 手机号是否能注册
     */
    @RequestMapping("getUserByUserPohone")
    @ResponseBody
    public CommonMessage getUserByUserPhone(String userPhone) {

        //创建一个返回值对象
        CommonMessage commonMessage = new CommonMessage();
        //调用userService的方法查询数据
        User user = userService.getUserByUserPhone(userPhone);
        //设置返回值
        commonMessage.setMsg(user != null ? "手机号已被注册" : "可以注册");

        return commonMessage;
    }

    /**
     * 执行用户注册操作
     *
     * @param username     用户名
     * @param userpassword 用户密码
     * @param userphone    用户的手机号
     * @param code         验证码
     * @return 是否注册成功的信息
     */
    @RequestMapping("userRegister")
    @ResponseBody
    public CommonMessage userRegister(String username, String userpassword, String userphone, String code) {

        //创建一个用户对象，并对其存值
        User user = new User();
        user.setUsername(username);
        user.setUserpassword(userpassword);
        user.setUserphone(userphone);
        user.setUserstatus(0);

        //创建一个返回值对象
        CommonMessage commonMessage = new CommonMessage();

        //查询数据库中是否有该手机号的用户
        User user1 = userService.getUserByUserPhone(userphone);

        //判断用户表中是否存在该手机号码的用户
        if (user1 != null) {
            //如果存在设置返回信息为注册失败信息
            commonMessage.setMsg("注册失败，该号码已被注册");
        } else {
            //查询phonecode表中是否存在当前的phone和code记录
            PhoneCode phoneCode = phoneCodeService.selectPhoneCodeByPhoneAndCode(userphone, code);

            if (phoneCode != null) {
                //phonecode表中存在当前的phone和code记录
                //调用添加用户的service
                boolean isok = userService.saveUser(user);

                //判断添加用户的放回值
                if (isok) {
                    //添加成功、设置返回信息
                    commonMessage.setMsg("注册成功");

                    //删除验证码信息
                    phoneCodeService.deletePhoneCode(userphone, code);

                } else {
                    //添加失败、设置返回信息
                    commonMessage.setMsg("注册失败");
                }
            } else {
                //phonecode表中不存在当前的phone和code记录、设置返回信息
                commonMessage.setMsg("注册失败");
            }
        }
        return commonMessage;
    }
}
