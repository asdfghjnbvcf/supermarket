package com.etc.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("backjump.action")
public class houtaitiaozhuan {
    @RequestMapping("commentlist")
    public String address() {
        return "admin/commentlist";
    }

    @RequestMapping("commoditylist")
    public String commoditylist() {
        return "admin/commoditylist";
    }

    @RequestMapping("communicationList")
    public String communicationList() {
        return "admin/communicationList";
    }

    @RequestMapping("console")
    public String console() {
        return "admin/console";
    }

    @RequestMapping("employeeform")
    public String employeeform() {
        return "admin/employeeform";
    }
    @RequestMapping("employeelist")
    public String employeelist() {
        return "admin/employeelist";
    }
    @RequestMapping("forget")
    public String forget() {
        return "admin/forget";
    }
    @RequestMapping("index")
    public String index() {
        return "admin/index";
    }

    @RequestMapping("login")
    public String login() {
        return "admin/login";
    }
    @RequestMapping("orderlist")
    public String orderlist() {
        return "admin/orderlist";
    }
    @RequestMapping("reg")
    public String reg() {
        return "admin/reg";
    }
    @RequestMapping("role")
    public String role() {
        return "admin/role";
    }
    @RequestMapping("roomlist")
    public String roomlist() {
        return "admin/roomlist";
    }
    @RequestMapping("seckillList")
    public String seckillList() {
        return "admin/seckillList";
    }
    @RequestMapping("userlist")
    public String userlist() {
        return "admin/userlist";
    }
    @RequestMapping("facelogin")
    public String  tofacelogin(){
        return "admin/facelogin";
    }
}
