package com.etc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 文件名:com.etc.vo.FlashGoodsDetialMessageVo
 * 描述：秒杀商品的详细信息
 * 作者:吴仕泉
 * 时间:2019/5/25 15:12
 */
public class FlashGoodsDetialMessageVo implements Serializable{
        //秒杀活动ID
        private  Integer flashsaleid;

        //秒杀开始时间:转为时间戳
        private String flashstarttime;

        //秒杀结束时间
        private  String flashendtime;

        //秒杀商品ID
        private  Integer flashgoodsid;

        //秒杀价格
        private  Double flashgoodsprice;

        //秒杀商品库存ID
        private Integer flashgoodsstockid;

        //秒杀商品库存
        private  Integer stocknum;

        //秒杀商品销售量
        private Integer sellnum;

        //商品ID
        private  Integer goodsid;

        //商品原价
        private Double goodsprice;

        //商品名称
        private String goodsname;

        //商品标题
        private String goodstitle;

        //商品详情
        private String goodsinformation;

        //商品所属二级分类ID
        private Integer twolevlid;

        //商品图片路径
        private List<String> pictureurl;

    public FlashGoodsDetialMessageVo() {
    }

    public FlashGoodsDetialMessageVo(Integer flashsaleid, String flashstarttime,
                                     String flashendtime, Integer flashgoodsid,
                                     Double flashgoodsprice, Integer flashgoodsstockid,
                                     Integer stocknum, Integer sellnum, Integer goodsid,
                                     Double goodsprice, String goodsname, String goodstitle,
                                     String goodsinformation, Integer twolevlid, List<String>
                                             pictureurl) {
        this.flashsaleid = flashsaleid;
        this.flashstarttime = flashstarttime;
        this.flashendtime = flashendtime;
        this.flashgoodsid = flashgoodsid;
        this.flashgoodsprice = flashgoodsprice;
        this.flashgoodsstockid = flashgoodsstockid;
        this.stocknum = stocknum;
        this.sellnum = sellnum;
        this.goodsid = goodsid;
        this.goodsprice = goodsprice;
        this.goodsname = goodsname;
        this.goodstitle = goodstitle;
        this.goodsinformation = goodsinformation;
        this.twolevlid = twolevlid;
        this.pictureurl = pictureurl;
    }

    public Integer getFlashsaleid() {
        return flashsaleid;
    }

    public void setFlashsaleid(Integer flashsaleid) {
        this.flashsaleid = flashsaleid;
    }

    public String getFlashstarttime() {
        return flashstarttime;
    }

    public void setFlashstarttime(String flashstarttime) {
        this.flashstarttime = flashstarttime;
    }

    public String getFlashendtime() {
        return flashendtime;
    }

    public void setFlashendtime(String flashendtime) {
        this.flashendtime = flashendtime;
    }

    public Integer getFlashgoodsid() {
        return flashgoodsid;
    }

    public void setFlashgoodsid(Integer flashgoodsid) {
        this.flashgoodsid = flashgoodsid;
    }

    public Double getFlashgoodsprice() {
        return flashgoodsprice;
    }

    public void setFlashgoodsprice(Double flashgoodsprice) {
        this.flashgoodsprice = flashgoodsprice;
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

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
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

    public Integer getTwolevlid() {
        return twolevlid;
    }

    public void setTwolevlid(Integer twolevlid) {
        this.twolevlid = twolevlid;
    }

    public List<String> getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(List<String> pictureurl) {
        this.pictureurl = pictureurl;
    }

    @Override
    public String toString() {
        return "FlashGoodsDetialMessageVo{" +
                "flashsaleid=" + flashsaleid +
                ", flashstarttime='" + flashstarttime + '\'' +
                ", flashendtime='" + flashendtime + '\'' +
                ", flashgoodsid=" + flashgoodsid +
                ", flashgoodsprice=" + flashgoodsprice +
                ", flashgoodsstockid=" + flashgoodsstockid +
                ", stocknum=" + stocknum +
                ", sellnum=" + sellnum +
                ", goodsid=" + goodsid +
                ", goodsprice=" + goodsprice +
                ", goodsname='" + goodsname + '\'' +
                ", goodstitle='" + goodstitle + '\'' +
                ", goodsinformation='" + goodsinformation + '\'' +
                ", twolevlid=" + twolevlid +
                ", pictureurl=" + pictureurl +
                '}';
    }
}
