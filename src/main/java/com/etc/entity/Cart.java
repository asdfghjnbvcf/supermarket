package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.Cart
 * 描述：购物车实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:24
 */
public class Cart implements Serializable{
    //购物车ID
    private Integer cartid;

    //用户ID
    private Integer userid;

    public Cart() {
    }

    public Cart(Integer cartid, Integer userid) {
        this.cartid = cartid;
        this.userid = userid;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartid=" + cartid +
                ", userid=" + userid +
                '}';
    }
}