package com.etc.user.controller;

import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.utils.CommonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/*
 * 文件名：com.etc.user.controller.LoginController
 * 描述：用户登录使用的
 * 作者：黄志鹏
 * 时间：2019/5/23 15:11
 */
@Controller
@RequestMapping("user.action")
public class UserLoginController {

    //注入一个userService对象
    @Autowired
    private UserService userService;

    /**
     * 登录界面跳转到注册界面的链接
     * @return
     */
    @RequestMapping("toRegister")
    public String toRegister() {
        return "user/register";
    }

    /**
     * 用户登录的控制器
     * @param userphone 用户手机号
     * @param userpassword 用户密码
     * @return 登录结果信息
     */
    @RequestMapping("doLogin")
    @ResponseBody
    public CommonMessage userDoLogin(String userphone, String userpassword , HttpSession session) {
        //创建一个返回值对象
        CommonMessage commonMessage = new CommonMessage();

        //根据手机号查询用户是否被注册
        User user = userService.getUserByUserPhone(userphone);

        //判断是否存在该用户
        if(user==null){

            //不存在该用户、设置返回值信息
            commonMessage.setMsg("该手机号还未注册，无法登录");
        }else {

            //存在该用户、判断该用户是否能够登录（判断用户状态）
            if (user.getUserstatus()==1){

                //账号被禁、设置返回信息
                commonMessage.setMsg("该账号已被禁用，请联系管理员");
            }else {

                //调用userService中的方法查询该用户
                User user2 = userService.getUserByUserPhoneAndUserPassword(userphone, userpassword);

                //判断是否存在该用户
                if (user2 != null) {

                    //存在该用户登录成功、设置返回值信息、并将用户信息存于session中
                    commonMessage.setMsg("登录成功");
                    session.setAttribute("user",user2);
                } else {

                    //不存在该用户、设置返回值信息
                    commonMessage.setMsg("账号或者密码有误、请重新登录");
                }
            }
        }

        return commonMessage;
    }
}
