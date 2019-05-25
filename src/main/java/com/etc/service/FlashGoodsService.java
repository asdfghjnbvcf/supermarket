package com.etc.service;

import com.etc.entity.po.FlashGoodsMessagePo;

import java.util.List;

/**
 * 文件名:com.etc.service.FlashGoodsService
 * 描述：秒杀商品业务接口
 * 作者:吴仕泉
 * 时间:2019/5/24 19:38
 */
public interface FlashGoodsService {

    //根据活动ID查询参加该活动的所有商品信息
    public List<FlashGoodsMessagePo> selectFlashSaleGoodsMessageBySaleId(Integer saleId);


}
