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
    private Date commenttime;

    //评论等级（好评、中评、差评）
    private Integer commentlevel;

    public Comment() {
    }

    public Comment(Integer commentid, Integer orderid, String commentcontent, String commentpicture, Date commenttime, Integer commentlevel) {
        this.commentid = commentid;
        this.orderid = orderid;
        this.commentcontent = commentcontent;
        this.commentpicture = commentpicture;
        this.commenttime = commenttime;
        this.commentlevel = commentlevel;
    }

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
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    public String getCommentpicture() {
        return commentpicture;
    }

    public void setCommentpicture(String commentpicture) {
        this.commentpicture = commentpicture == null ? null : commentpicture.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public Integer getCommentlevel() {
        return commentlevel;
    }

    public void setCommentlevel(Integer commentlevel) {
        this.commentlevel = commentlevel;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentid=" + commentid +
                ", orderid=" + orderid +
                ", commentcontent='" + commentcontent + '\'' +
                ", commentpicture='" + commentpicture + '\'' +
                ", commenttime=" + commenttime +
                ", commentlevel=" + commentlevel +
                '}';
    }
}