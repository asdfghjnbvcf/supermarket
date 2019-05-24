package com.etc.service.impl;

import com.etc.dao.FlashSaleDao;
import com.etc.entity.FlashSale;
import com.etc.service.FlashSaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件名:com.etc.service.impl
 * 描述：
 * 作者:吴仕泉
 * 时间:2019/5/24 2:15
 */
@Service
public class FlashSaleServiceImpl implements FlashSaleService {

    @Autowired
    FlashSaleDao flashSaleDao;

    //查询今日的所有秒杀活动
    @Override
    public List<FlashSale> selectTodaySale() {

        return null;
    }
}
