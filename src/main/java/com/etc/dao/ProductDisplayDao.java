package com.etc.dao;/*
 * 文件名：com.etc.dao
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 15:56
 */

import com.etc.entity.OneLevel;
import com.etc.entity.ProductDisplay;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 二级展示所有商品
 */
@Repository
@Mapper
public interface ProductDisplayDao {
    List<ProductDisplay> listProductDisplayById(Integer twolevelid);
    Integer getTotal(Integer twolevelid);
}
