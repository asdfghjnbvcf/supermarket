package com.etc.entity.po;


import java.io.Serializable;

/**
 * 文件名:com.etc.vo.FlashGoodsMessageVo
 * 描述：秒杀商品具体信息
 * 作者:吴仕泉
 * 时间:2019/5/24 17:03
 */
public class FlashGoodsMessagePo implements Serializable{
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

    //商品图片路径
    private String pictureurl;

    //商品图片ID
    private Integer pictureid;

    //秒杀活动ID
    private Integer flashsaleid;

    //秒杀活动商品ID
    private  Integer flashgoodsid;

    //秒杀价格
    private Double flashgoodsprice;

    //参加秒杀商品的数量
    private Integer stocknum;

    //销售量
    private Integer sellnum;

    public FlashGoodsMessagePo() {
    }

    public FlashGoodsMessagePo(Integer goodsid, Integer twolevelid, String goodsname, Double goodsprice, String goodstitle, String goodsinformation, String pictureurl, Integer pictureid, Integer flashsaleid, Integer flashgoodsid, Double flashgoodsprice, Integer stocknum, Integer sellnum) {
        this.goodsid = goodsid;
        this.twolevelid = twolevelid;
        this.goodsname = goodsname;
        this.goodsprice = goodsprice;
        this.goodstitle = goodstitle;
        this.goodsinformation = goodsinformation;
        this.pictureurl = pictureurl;
        this.pictureid = pictureid;
        this.flashsaleid = flashsaleid;
        this.flashgoodsid = flashgoodsid;
        this.flashgoodsprice = flashgoodsprice;
        this.stocknum = stocknum;
        this.sellnum = sellnum;
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
        this.goodsname = goodsname;
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
        this.goodstitle = goodstitle;
    }

    public String getGoodsinformation() {
        return goodsinformation;
    }

    public void setGoodsinformation(String goodsinformation) {
        this.goodsinformation = goodsinformation;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl;
    }

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public Integer getFlashsaleid() {
        return flashsaleid;
    }

    public void setFlashsaleid(Integer flashsaleid) {
        this.flashsaleid = flashsaleid;
    }

    public Double getFlashgoodsprice() {
        return flashgoodsprice;
    }

    public void setFlashgoodsprice(Double flashgoodsprice) {
        this.flashgoodsprice = flashgoodsprice;
    }

    public Integer getFlashgoodsid() {
        return flashgoodsid;
    }

    public void setFlashgoodsid(Integer flashgoodsid) {
        this.flashgoodsid = flashgoodsid;
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

    @Override
    public String toString() {
        return "FlashGoodsMessagePo{" +
                "goodsid=" + goodsid +
                ", twolevelid=" + twolevelid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsprice=" + goodsprice +
                ", goodstitle='" + goodstitle + '\'' +
                ", goodsinformation='" + goodsinformation + '\'' +
                ", pictureurl='" + pictureurl + '\'' +
                ", pictureid=" + pictureid +
                ", flashsaleid=" + flashsaleid +
                ", flashgoodsid=" + flashgoodsid +
                ", flashgoodsprice=" + flashgoodsprice +
                ", stocknum=" + stocknum +
                ", sellnum=" + sellnum +
                '}';
    }
}
