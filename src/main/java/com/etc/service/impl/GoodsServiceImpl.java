package com.etc.service.impl;/*
 * 文件名：com.etc.service.impl
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/24 16:32
 */

import com.etc.dao.GoodsDao;
import com.etc.entity.Goods;
import com.etc.entity.TwoLevel;
import com.etc.service.GoodsService;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public PageData<Goods> listGoodsByPage ( Integer page, Integer pageSize, String content ) {
        int start=(page-1)*pageSize;
        List<Goods> data=goodsDao.listGoodsByPage(start,pageSize,content);
        int count=goodsDao.getTotal(content);
        PageData<Goods> pd=new PageData<>(data, count, pageSize, page);
        return pd;
    }
}
