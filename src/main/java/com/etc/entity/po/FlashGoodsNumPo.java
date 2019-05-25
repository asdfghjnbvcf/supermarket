package com.etc.entity.po;

/**
 * 文件名:com.etc.entity.po.FlashGoodsNumPo
 * 描述：参加秒杀活动商品库存
 * 作者:吴仕泉
 * 时间:2019/5/24 18:21
 */
public class FlashGoodsNumPo {
    //参加秒杀活动商品ID
    private Integer flashgoodsid;

    //参加秒杀活动商品库存
    private  Integer goodnum;

    public FlashGoodsNumPo() {
    }

    public FlashGoodsNumPo(Integer flashgoodsid, Integer goodnum) {
        this.flashgoodsid = flashgoodsid;
        this.goodnum = goodnum;
    }

    public Integer getFlashgoodsid() {
        return flashgoodsid;
    }

    public void setFlashgoodsid(Integer flashgoodsid) {
        this.flashgoodsid = flashgoodsid;
    }

    public Integer getGoodnum() {
        return goodnum;
    }

    public void setGoodnum(Integer goodnum) {
        this.goodnum = goodnum;
    }

    @Override
    public String toString() {
        return "FlashGoodsNumPo{" +
                "flashgoodsid=" + flashgoodsid +
                ", goodnum=" + goodnum +
                '}';
    }
}
