package com.etc.admin.controller;

import com.etc.entity.Comment;
import com.etc.service.CommentService;
import com.etc.utils.CommonMessage;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文件名：com.etc.admin.controller
 * 描述：
 * 作者：高文乾
 * 时间： 2019/5/23 16:42.
 */
@Controller
@RequestMapping(value = "admin.action")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 分页+模糊查询
     * @param page
     * @param limit
     * @param content
     * @return
     */
    @GetMapping(value = "listComment")
    @ResponseBody
    public PageData<Comment> listComment(Integer page,Integer limit,String content){
        if (content == null){
            content="";
        }
        PageData<Comment> pd = commentService.getCommentsByPage(page,limit,content);

        //返回Json格式的对象
        pd.setCode(0);
        pd.setMsg("请求成功");
        return pd;
    }


    /**
     * Ajax删除数据
     * @param commentid
     * @return
     */
    @RequestMapping(value = "deleteComment/{commentid}",method = RequestMethod.DELETE)
    @ResponseBody
    public CommonMessage deleteComment(@PathVariable("commentid") Integer commentid){
        Boolean flag = commentService.deleteCommentById(commentid);

        CommonMessage cm = new CommonMessage();
        if (flag){
            cm.setMsg("删除成功");
        }else{
            cm.setMsg("删除失败");
        }
        return cm;
    }

}
