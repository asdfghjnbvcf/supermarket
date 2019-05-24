package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.UserAddress
 * 描述：用户地址实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 18:24
 */
public class UserAddress implements Serializable{
    //收货地址ID
    private Integer addressid;

    //用户ID
    private Integer userid;

    //地址
    private String address;

    public UserAddress() {
    }

    public UserAddress(Integer addressid, Integer userid, String address) {
        this.addressid = addressid;
        this.userid = userid;
        this.address = address;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "addressid=" + addressid +
                ", userid=" + userid +
                ", address='" + address + '\'' +
                '}';
    }
}