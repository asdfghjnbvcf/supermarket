package com.etc.service;/*
 * 文件名：com.etc.service
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 10:23
 */

import com.etc.entity.TwoLevel;

import java.util.List;

/**
 * 一级分类下的service接口
 */
public interface TwoLevelService {
    List<TwoLevel> listTwoLevel ();
    TwoLevel getTwoLevelById(Integer twolevelid);
}
