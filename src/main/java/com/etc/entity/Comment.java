package com.etc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 文件名:com.etc.entity.Comment
 * 描述：评论实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:28
 */
public class Comment implements Serializable{
    //评论ID
    private Integer commentid;

    //订单ID
    private Integer orderid;

    //评论内容
    private String commentcontent;

    //评论上传的图片
    private String commentpicture;

    //评论时间
    private String commenttime;

    //评论等级（好评、中评、差评）
    private Integer commentlevel;

    //订单编号
    private String ordernum;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    public String getCommentpicture() {
        return commentpicture;
    }

    public void setCommentpicture(String commentpicture) {
        this.commentpicture = commentpicture;
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime;
    }

    public Integer getCommentlevel() {
        return commentlevel;
    }

    public void setCommentlevel(Integer commentlevel) {
        this.commentlevel = commentlevel;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentid=" + commentid +
                ", orderid=" + orderid +
                ", commentcontent='" + commentcontent + '\'' +
                ", commentpicture='" + commentpicture + '\'' +
                ", commenttime='" + commenttime + '\'' +
                ", commentlevel=" + commentlevel +
                ", ordernum='" + ordernum + '\'' +
                '}';
    }

    public Comment() {
    }

    public Comment(Integer commentid, Integer orderid, String commentcontent, String commentpicture, String commenttime, Integer commentlevel, String ordernum) {
        this.commentid = commentid;
        this.orderid = orderid;
        this.commentcontent = commentcontent;
        this.commentpicture = commentpicture;
        this.commenttime = commenttime;
        this.commentlevel = commentlevel;
        this.ordernum = ordernum;
    }
}