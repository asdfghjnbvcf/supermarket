package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.GoodsPicture
 * 描述：商品价格实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:58
 */
public class GoodsPicture implements Serializable{
    //商品图片ID
    private Integer pictureid;

    //商品ID
    private Integer goodsid;

    //商品图片路径
    private String pictureurl;

    public GoodsPicture() {
    }

    public GoodsPicture(Integer pictureid, Integer goodsid, String pictureurl) {
        this.pictureid = pictureid;
        this.goodsid = goodsid;
        this.pictureurl = pictureurl;
    }

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    @Override
    public String toString() {
        return "GoodsPicture{" +
                "pictureid=" + pictureid +
                ", goodsid=" + goodsid +
                ", pictureurl='" + pictureurl + '\'' +
                '}';
    }
}