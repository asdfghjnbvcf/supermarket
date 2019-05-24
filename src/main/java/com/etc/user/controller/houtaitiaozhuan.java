package com.etc.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin.action")
public class houtaitiaozhuan {
    @RequestMapping("commentList")
    public String address() {
        return "admin/commentList";
    }

    @RequestMapping("commodityList")
    public String commoditylist() {
        return "admin/commodityList";
    }

    @RequestMapping("communicationList")
    public String communicationList() {
        return "admin/communicationList";
    }

    @RequestMapping("console")
    public String console() {
        return "admin/console";
    }

    @RequestMapping("employeeForm")
    public String employeeform() {
        return "admin/employeeForm";
    }
    @RequestMapping("employeeList")
    public String employeelist() {
        return "admin/employeeList";
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
    @RequestMapping("orderList")
    public String orderlist() {
        return "admin/orderList";
    }
    @RequestMapping("reg")
    public String reg() {
        return "admin/reg";
    }
    @RequestMapping("role")
    public String role() {
        return "admin/role";
    }
    @RequestMapping("roomList")
    public String roomlist() {
        return "admin/roomList";
    }
    @RequestMapping("seckillList")
    public String seckillList() {
        return "admin/seckillList";
    }
    @RequestMapping("userList")
    public String userlist() {
        return "admin/userList";
    }
    @RequestMapping("faceLogin")
    public String  tofacelogin(){
        return "admin/faceLogin";
    }
    @RequestMapping("oneLevelList")
    public String  oneLevelList(){
        return "admin/oneLevelList";
    }
}
