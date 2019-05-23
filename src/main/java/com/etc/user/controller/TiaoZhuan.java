package com.etc.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump.action")
public class TiaoZhuan {
    @RequestMapping("address")
    public String address(){
        return "user/address";
    }
    @RequestMapping("bill")
    public String bill(){
        return "user/bill";
    }
    @RequestMapping("billList")
    public String billList(){
        return "user/billList";
    }
    @RequestMapping("bindPhone")
    public String bindPhone(){
        return "user/bindPhone";
    }
    @RequestMapping("blog")
    public String blog(){
        return "user/blog";
    }
    @RequestMapping("change")
    public String change(){
        return "user/change";
    }
    @RequestMapping("collection")
    public String collection(){
        return "user/collection";
    }
    @RequestMapping("comment")
    public String comment(){
        return "user/comment";
    }
    @RequestMapping("commentList")
    public String commentList(){
        return "user/commentList";
    }
    @RequestMapping("home")
    public String home(){
        return "user/home";
    }
    @RequestMapping("idcard")
    public String idcard(){
        return "user/idcard";
    }
    @RequestMapping("index")
    public String index(){
        return "user/index";
    }
    @RequestMapping("information")
    public String information(){
        return "user/information";
    }
    @RequestMapping("introduction")
    public String introduction(){
        return "user/introduction";
    }
    @RequestMapping("login")
    public String login(){
        return "user/login";
    }
    @RequestMapping("logistics")
    public String logistics(){
        return "user/logistics";
    }
    @RequestMapping("news")
    public String news(){
        return "user/news";
    }
    @RequestMapping("order")
    public String order(){
        return "user/order";
    }
    @RequestMapping("orderInfo")
    public String orderInfo(){
        return "user/orderInfo";
    }
    @RequestMapping("password")
    public String password(){
        return "user/password";
    }
    @RequestMapping("pay")
    public String pay(){
        return "user/pay";
    }
    @RequestMapping("register")
    public String register(){
        return "user/register";
    }
    @RequestMapping("safety")
    public String safety(){
        return "user/safety";
    }
    @RequestMapping("search")
    public String search(){
        return "user/search";
    }
    @RequestMapping("setPay")
    public String setPay(){
        return "user/setPay";
    }
    @RequestMapping("shopCart")
    public String shopCart(){
        return "user/shopCart";
    }
    @RequestMapping("sort")
    public String sort(){
        return "user/sort";
    }
    @RequestMapping("success")
    public String success(){
        return "user/success";
    }
    @RequestMapping("flashSale")
    public String flashSale(){
        return "user/flashSale";
    }





}
