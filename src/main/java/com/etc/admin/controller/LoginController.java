package com.etc.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 文件名：com.etc.admin.controller.LoginController
 * 描述：
 * 作者：
 * 时间：2019/5/23 10:20
 */
@Controller
@RequestMapping("admin.action")
public class LoginController {

    @RequestMapping("tofacelogin")
    public String toFaceLogin(){
        return "admin/facelogin";
    }
}
