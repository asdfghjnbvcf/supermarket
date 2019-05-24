package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.CartList
 * 描述：购物车项实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:24
 */
public class CartList implements Serializable{
    //购物车项ID
    private Integer cartlistid;

    //商品ID
    private Integer goodsid;

    //商品数量
    private Integer goodsnum;

    //购物车ID
    private Integer cartid;

    public CartList() {
    }

    public CartList(Integer cartlistid, Integer goodsid, Integer goodsnum, Integer cartid) {
        this.cartlistid = cartlistid;
        this.goodsid = goodsid;
        this.goodsnum = goodsnum;
        this.cartid = cartid;
    }

    public Integer getCartlistid() {
        return cartlistid;
    }

    public void setCartlistid(Integer cartlistid) {
        this.cartlistid = cartlistid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    @Override
    public String toString() {
        return "CartList{" +
                "cartlistid=" + cartlistid +
                ", goodsid=" + goodsid +
                ", goodsnum=" + goodsnum +
                ", cartid=" + cartid +
                '}';
    }
}