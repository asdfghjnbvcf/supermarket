package com.etc.service;

import com.etc.entity.FlashSale;

import java.util.List;

/**
 * 文件名:com.etc.service.FlashSaleServiceImpl
 * 描述：秒杀活动业务层接口
 * 作者:吴仕泉
 * 时间:2019/5/24 2:11
 */
public interface FlashSaleService {

    //查询今日的所有秒杀活动
    public List<FlashSale> selectTodaySale();
}
