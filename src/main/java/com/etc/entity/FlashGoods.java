package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.FlashGoods
 * 描述 参加秒杀商品的实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:31
 */
public class FlashGoods implements Serializable{
    //参加秒杀商品ID
    private Integer flashgoodsid;

    //秒杀商品活动
    private Integer flashsaleid;

    //商品ID
    private Integer goodsid;

    //秒杀价格
    private Double flashgoodsprice;

    //参加秒杀商品的数量
    private Integer goodnum;

    public FlashGoods() {
    }

    public FlashGoods(Integer flashgoodsid, Integer flashsaleid, Integer goodsid, Double flashgoodsprice, Integer goodnum) {
        this.flashgoodsid = flashgoodsid;
        this.flashsaleid = flashsaleid;
        this.goodsid = goodsid;
        this.flashgoodsprice = flashgoodsprice;
        this.goodnum = goodnum;
    }

    public Integer getFlashgoodsid() {
        return flashgoodsid;
    }

    public void setFlashgoodsid(Integer flashgoodsid) {
        this.flashgoodsid = flashgoodsid;
    }

    public Integer getFlashsaleid() {
        return flashsaleid;
    }

    public void setFlashsaleid(Integer flashsaleid) {
        this.flashsaleid = flashsaleid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Double getFlashgoodsprice() {
        return flashgoodsprice;
    }

    public void setFlashgoodsprice(Double flashgoodsprice) {
        this.flashgoodsprice = flashgoodsprice;
    }

    public Integer getGoodnum() {
        return goodnum;
    }

    public void setGoodnum(Integer goodnum) {
        this.goodnum = goodnum;
    }

    @Override
    public String toString() {
        return "FlashGoods{" +
                "flashgoodsid=" + flashgoodsid +
                ", flashsaleid=" + flashsaleid +
                ", goodsid=" + goodsid +
                ", flashgoodsprice=" + flashgoodsprice +
                ", goodnum=" + goodnum +
                '}';
    }
}