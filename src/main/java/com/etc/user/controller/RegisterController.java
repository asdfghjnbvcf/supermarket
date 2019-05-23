package com.etc.user.controller;

import com.etc.utils.CommonMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user.action")
public class RegisterController {
    /**
     * 注册发送验证码的控制器
     * 接收手机号，发送相应的验证码
     * @param phone 要发送验证码的手机号
     * @return 返回发送成功或者发送失败
     */
    @RequestMapping("sendsms")
    @ResponseBody
    public CommonMessage sendSms(String phone){
        CommonMessage commonMessage  = new CommonMessage();
        return commonMessage;
    }
}
