package com.etc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 文件名:com.etc.entity.FlashOrder
 * 描述 秒杀订单实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:33
 */
public class FlashOrder implements Serializable{
    //秒杀订单ID
    private Integer flashorderid;

    //秒杀订单编号
    private String flashordernum;

    //用户ID
    private Integer userid;

    //秒杀订单价格
    private Double flashsalary;

    //下单时间
    private Date flashordertime;

    //订单状态(0：未付款，1：已付款，2：已发货，3：已完成）
    private Integer flashorderstatus;

    //商品ID
    private Integer goodsid;

    //秒杀商品数量
    private Integer goodsnum;

    //收货地址
    private Integer useraddressid;

    public FlashOrder() {
    }

    public FlashOrder(Integer flashorderid, String flashordernum, Integer userid, Double flashsalary, Date flashordertime, Integer flashorderstatus, Integer goodsid, Integer goodsnum, Integer useraddressid) {
        this.flashorderid = flashorderid;
        this.flashordernum = flashordernum;
        this.userid = userid;
        this.flashsalary = flashsalary;
        this.flashordertime = flashordertime;
        this.flashorderstatus = flashorderstatus;
        this.goodsid = goodsid;
        this.goodsnum = goodsnum;
        this.useraddressid = useraddressid;
    }

    public Integer getFlashorderid() {
        return flashorderid;
    }

    public void setFlashorderid(Integer flashorderid) {
        this.flashorderid = flashorderid;
    }

    public String getFlashordernum() {
        return flashordernum;
    }

    public void setFlashordernum(String flashordernum) {
        this.flashordernum = flashordernum == null ? null : flashordernum.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getFlashsalary() {
        return flashsalary;
    }

    public void setFlashsalary(Double flashsalary) {
        this.flashsalary = flashsalary;
    }

    public Date getFlashordertime() {
        return flashordertime;
    }

    public void setFlashordertime(Date flashordertime) {
        this.flashordertime = flashordertime;
    }

    public Integer getFlashorderstatus() {
        return flashorderstatus;
    }

    public void setFlashorderstatus(Integer flashorderstatus) {
        this.flashorderstatus = flashorderstatus;
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
        return "FlashOrder{" +
                "flashorderid=" + flashorderid +
                ", flashordernum='" + flashordernum + '\'' +
                ", userid=" + userid +
                ", flashsalary=" + flashsalary +
                ", flashordertime=" + flashordertime +
                ", flashorderstatus=" + flashorderstatus +
                ", goodsid=" + goodsid +
                ", goodsnum=" + goodsnum +
                ", useraddressid=" + useraddressid +
                '}';
    }
}