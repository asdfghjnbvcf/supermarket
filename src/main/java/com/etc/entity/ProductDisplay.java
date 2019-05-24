package com.etc.entity;/*
 * 文件名：com.etc.entity
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 15:51
 */

public class ProductDisplay {
    private Integer goodsid;
    private String goodsname;
    private Double goodsprice;
    private String goodstitle;
    private Integer twolevelid;
    private String twolevelname;
    private Integer goodssalenum;
    private String pictureurl;

    public Integer getGoodsid () {
        return goodsid;
    }

    public void setGoodsid ( Integer goodsid ) {
        this.goodsid = goodsid;
    }

    public String getGoodsname () {
        return goodsname;
    }

    public void setGoodsname ( String goodsname ) {
        this.goodsname = goodsname;
    }

    public Double getGoodsprice () {
        return goodsprice;
    }

    public void setGoodsprice ( Double goodsprice ) {
        this.goodsprice = goodsprice;
    }

    public String getGoodstitle () {
        return goodstitle;
    }

    public void setGoodstitle ( String goodstitle ) {
        this.goodstitle = goodstitle;
    }

    public Integer getTwolevelid () {
        return twolevelid;
    }

    public void setTwolevelid ( Integer twolevelid ) {
        this.twolevelid = twolevelid;
    }

    public String getTwolevelname () {
        return twolevelname;
    }

    public void setTwolevelname ( String twolevelname ) {
        this.twolevelname = twolevelname;
    }

    public Integer getGoodssalenum () {
        return goodssalenum;
    }

    public void setGoodssalenum ( Integer goodssalenum ) {
        this.goodssalenum = goodssalenum;
    }

    public String getPictureurl () {
        return pictureurl;
    }

    public void setPictureurl ( String pictureurl ) {
        this.pictureurl = pictureurl;
    }

    @Override
    public String toString () {
        return "ProductDisplay{" +
                "goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsprice=" + goodsprice +
                ", goodstitle='" + goodstitle + '\'' +
                ", twolevelid=" + twolevelid +
                ", twolevelname='" + twolevelname + '\'' +
                ", goodssalenum=" + goodssalenum +
                ", pictureurl='" + pictureurl + '\'' +
                '}';
    }

    public ProductDisplay ( Integer goodsid, String goodsname, Double goodsprice, String goodstitle, Integer twolevelid, String twolevelname, Integer goodssalenum, String pictureurl ) {
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.goodsprice = goodsprice;
        this.goodstitle = goodstitle;
        this.twolevelid = twolevelid;
        this.twolevelname = twolevelname;
        this.goodssalenum = goodssalenum;
        this.pictureurl = pictureurl;
    }

    public ProductDisplay () {
    }

}
