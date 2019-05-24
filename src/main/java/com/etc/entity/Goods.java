package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.Goods
 * 描述：商品实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:48
 */
public class Goods implements Serializable{
    //商品ID
    private Integer goodsid;

    //商品所属三级分类
    private Integer twolevelid;

    //商品名字
    private String goodsname;

    //商品价格
    private Double goodsprice;

    //商品标题
    private String goodstitle;

    //商品详情
    private String goodsinformation;

    public Goods() {
    }

    public Goods(Integer goodsid, Integer twolevelid, String goodsname, Double goodsprice, String goodstitle, String goodsinformation) {
        this.goodsid = goodsid;
        this.twolevelid = twolevelid;
        this.goodsname = goodsname;
        this.goodsprice = goodsprice;
        this.goodstitle = goodstitle;
        this.goodsinformation = goodsinformation;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getTwolevelid() {
        return twolevelid;
    }

    public void setTwolevelid(Integer twolevelid) {
        this.twolevelid = twolevelid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodstitle() {
        return goodstitle;
    }

    public void setGoodstitle(String goodstitle) {
        this.goodstitle = goodstitle == null ? null : goodstitle.trim();
    }

    public String getGoodsinformation() {
        return goodsinformation;
    }

    public void setGoodsinformation(String goodsinformation) {
        this.goodsinformation = goodsinformation == null ? null : goodsinformation.trim();
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", twolevelid=" + twolevelid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsprice=" + goodsprice +
                ", goodstitle='" + goodstitle + '\'' +
                ", goodsinformation='" + goodsinformation + '\'' +
                '}';
    }
}