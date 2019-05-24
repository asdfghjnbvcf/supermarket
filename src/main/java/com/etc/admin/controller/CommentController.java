package com.etc.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件名：com.etc.admin.controller
 * 描述：
 * 作者：高文乾
 * 时间： 2019/5/23 16:42.
 */
@Controller
@RequestMapping(value = "admin.action")
public class CommentController {

    @RequestMapping(value = "intoComment")
    public String intoComment(){
        return "admin/commentlist";
    }
}
