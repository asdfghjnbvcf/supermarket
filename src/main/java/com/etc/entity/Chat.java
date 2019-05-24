package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.Chat
 * 描述：聊天实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:26
 */
public class Chat implements Serializable{
    //聊天记录ID
    private Integer userchatid;

    //消息
    private String msg;

    //发送者
    private String from;

    //接收者
    private String to;

    public Chat() {
    }

    public Chat(Integer userchatid, String msg, String from, String to) {
        this.userchatid = userchatid;
        this.msg = msg;
        this.from = from;
        this.to = to;
    }

    public Integer getUserchatid() {
        return userchatid;
    }

    public void setUserchatid(Integer userchatid) {
        this.userchatid = userchatid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    @Override
    public String toString() {
        return "Chat{" +
                "userchatid=" + userchatid +
                ", msg='" + msg + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}