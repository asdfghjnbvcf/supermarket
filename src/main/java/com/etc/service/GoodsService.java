package com.etc.service;/*
 * 文件名：com.etc.service
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 10:23
 */

import com.etc.entity.Goods;
import com.etc.utils.PageData;

import java.util.List;

/**
 * 商品表的service接口
 */
public interface GoodsService {
    PageData<Goods> listGoodsByPage ( Integer page, Integer pageSize, String content );
}
