package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.OrderList
 * 描述：订单项实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:58
 */
public class OrderList implements Serializable{
    //订单项ID
    private Integer orderlistid;

    //订单ID
    private Integer orderid;

    //商品ID
    private Integer goodsid;

    //商品数量
    private Integer goodsnum;

    public OrderList() {
    }

    public OrderList(Integer orderlistid, Integer orderid, Integer goodsid, Integer goodsnum) {
        this.orderlistid = orderlistid;
        this.orderid = orderid;
        this.goodsid = goodsid;
        this.goodsnum = goodsnum;
    }

    public Integer getOrderlistid() {
        return orderlistid;
    }

    public void setOrderlistid(Integer orderlistid) {
        this.orderlistid = orderlistid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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

    @Override
    public String toString() {
        return "OrderList{" +
                "orderlistid=" + orderlistid +
                ", orderid=" + orderid +
                ", goodsid=" + goodsid +
                ", goodsnum=" + goodsnum +
                '}';
    }
}