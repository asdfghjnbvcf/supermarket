package com.etc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 文件名:com.etc.entity.Orders
 * 描述：订单实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:58
 */
public class Orders implements Serializable{
    //订单ID
    private Integer orderid;

    //订单编号
    private String ordernum;

    //用户ID
    private Integer userid;

    //订单总价
    private Double ordersalary;

    //下订单时间
    private Date ordertime;

    //订单状态(0：未付款，1：已付款，2：已发货，3：已完成）
    private Integer orderstatus;

    //收货地址ID
    private  Integer useraddressid;

    public Orders() {
    }

    public Orders(Integer orderid, String ordernum, Integer userid, Double ordersalary, Date ordertime, Integer orderstatus, Integer useraddressid) {
        this.orderid = orderid;
        this.ordernum = ordernum;
        this.userid = userid;
        this.ordersalary = ordersalary;
        this.ordertime = ordertime;
        this.orderstatus = orderstatus;
        this.useraddressid = useraddressid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getOrdersalary() {
        return ordersalary;
    }

    public void setOrdersalary(Double ordersalary) {
        this.ordersalary = ordersalary;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderid=" + orderid +
                ", ordernum='" + ordernum + '\'' +
                ", userid=" + userid +
                ", ordersalary=" + ordersalary +
                ", ordertime=" + ordertime +
                ", orderstatus=" + orderstatus +
                ", useraddressid=" + useraddressid +
                '}';
    }
}