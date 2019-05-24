package com.etc.user.controller;

import com.etc.entity.User;
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

    /**
     * 注册发送验证码的控制器
     * 接收手机号，发送相应的验证码
     * @param phone 要发送验证码的手机号
     * @return 返回发送成功或者发送失败
     */
    @RequestMapping("sendSms")
    @ResponseBody
    public CommonMessage sendSms(String phone){
        CommonMessage commonMessage  = new CommonMessage();
        return commonMessage;
    }

    /**
     * 注册页面跳转至登录界面的方法
     * @return 登录界面的地址
     */
    @RequestMapping("toLogin")
    public String toLogin(){
        return "user/login";
    }

    /**
     * 注册界面跳转至首页的方法
     * @return 首页的地址
     */
    @RequestMapping("toHome")
    public String toHmoe(){
        return "user/home";
    }

    @RequestMapping("getUserByUserPohone")
    @ResponseBody
    public CommonMessage getUserByUserPhone(String userPhone){

        CommonMessage commonMessage  = new CommonMessage();
        boolean flag  =  userService.getUserByUserPhone(userPhone);
        commonMessage.setMsg(flag?"手机号已被注册":"可以使用");

        return commonMessage;
    }
}
