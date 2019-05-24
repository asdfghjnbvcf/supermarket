package com.etc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 文件名:com.etc.entity.User
 * 描述：用户实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 18:22
 */
public class User implements Serializable{
    //用户ID
    private Integer userid;

    //用户名字
    private String username;

    //密码
    private String userpassword;

    //用户性别
    private String usersex;

    //用户电话
    private String userphone;

    //用户注册日期
    private Date userregisday;

    //用户生日
    private Date userbirthday;

    //用户头像路径
    private String userpicture;

    //用户状态（0：白名单，1：黑名单）
    private Integer userstatus;

    public User() {
    }

    public User(Integer userid, String username, String userpassword, String usersex, String userphone, Date userregisday, Date userbirthday, String userpicture, Integer userstatus) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.usersex = usersex;
        this.userphone = userphone;
        this.userregisday = userregisday;
        this.userbirthday = userbirthday;
        this.userpicture = userpicture;
        this.userstatus = userstatus;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Date getUserregisday() {
        return userregisday;
    }

    public void setUserregisday(Date userregisday) {
        this.userregisday = userregisday;
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public String getUserpicture() {
        return userpicture;
    }

    public void setUserpicture(String userpicture) {
        this.userpicture = userpicture == null ? null : userpicture.trim();
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", usersex='" + usersex + '\'' +
                ", userphone='" + userphone + '\'' +
                ", userregisday=" + userregisday +
                ", userbirthday=" + userbirthday +
                ", userpicture='" + userpicture + '\'' +
                ", userstatus=" + userstatus +
                '}';
    }
}