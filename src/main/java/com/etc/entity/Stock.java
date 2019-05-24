package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.Stock
 * 描述：库存实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 18:22
 */
public class Stock implements Serializable{
    //库存ID
    private Integer stockid;

    //商品ID
    private Integer goodsid;

    //库存数量
    private Integer goodsnum;

    //商品销售量
    private Integer goodssalenum;

    public Stock() {
    }

    public Stock(Integer stockid, Integer goodsid, Integer goodsnum, Integer goodssalenum) {
        this.stockid = stockid;
        this.goodsid = goodsid;
        this.goodsnum = goodsnum;
        this.goodssalenum = goodssalenum;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
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

    public Integer getGoodssalenum() {
        return goodssalenum;
    }

    public void setGoodssalenum(Integer goodssalenum) {
        this.goodssalenum = goodssalenum;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockid=" + stockid +
                ", goodsid=" + goodsid +
                ", goodsnum=" + goodsnum +
                ", goodssalenum=" + goodssalenum +
                '}';
    }
}