package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.PhoneCode
 * 描述：手机验证实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 18:18
 */
public class PhoneCode implements Serializable{
    //手机验证ID
    private Integer id;

    //手机号码
    private String phone;

    //验证码
    private String code;

    public PhoneCode() {
    }

    public PhoneCode(Integer id, String phone, String code) {
        this.id = id;
        this.phone = phone;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    @Override
    public String toString() {
        return "PhoneCode{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}