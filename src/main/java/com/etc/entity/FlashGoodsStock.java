package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.FlashGoodsStock
 * 描述：秒杀商品库存与销售量
 * 作者:吴仕泉
 * 时间:2019/5/24 17:31
 */
public class FlashGoodsStock implements Serializable{
    //秒杀商品库存ID
    private Integer flashgoodsstockid;

    //库存总量
    private Integer stocknum;

    //销售量
    private Integer sellnum;

    //秒杀活动商品ID
    private Integer flashgoodsid;

    public FlashGoodsStock() {
    }

    public FlashGoodsStock(Integer flashgoodsstockid, Integer stocknum, Integer sellnum, Integer flashgoodsid) {
        this.flashgoodsstockid = flashgoodsstockid;
        this.stocknum = stocknum;
        this.sellnum = sellnum;
        this.flashgoodsid = flashgoodsid;
    }

    public Integer getFlashgoodsstockid() {
        return flashgoodsstockid;
    }

    public void setFlashgoodsstockid(Integer flashgoodsstockid) {
        this.flashgoodsstockid = flashgoodsstockid;
    }

    public Integer getStocknum() {
        return stocknum;
    }

    public void setStocknum(Integer stocknum) {
        this.stocknum = stocknum;
    }

    public Integer getSellnum() {
        return sellnum;
    }

    public void setSellnum(Integer sellnum) {
        this.sellnum = sellnum;
    }

    public Integer getFlashgoodsid() {
        return flashgoodsid;
    }

    public void setFlashgoodsid(Integer flashgoodsid) {
        this.flashgoodsid = flashgoodsid;
    }

    @Override
    public String toString() {
        return "FlashGoodsStock{" +
                "flashgoodsstockid=" + flashgoodsstockid +
                ", stocknum=" + stocknum +
                ", sellnum=" + sellnum +
                ", flashgoodsid=" + flashgoodsid +
                '}';
    }
}