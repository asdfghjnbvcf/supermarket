package com.etc.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 文件名：com.etc.user.controller.LoginController
 * 描述：用户登录使用的
 * 作者：
 * 时间：2019/5/23 15:11
 */
@Controller
@RequestMapping("user.action")
public class UserLoginController {
    @RequestMapping("toRegister")
    public String toRegister(){
        return "user/register";
    }
}
