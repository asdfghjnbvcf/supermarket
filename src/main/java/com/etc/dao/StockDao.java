package com.etc.dao;

import com.etc.entity.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.StockDao
 * 描述：商品库存持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface StockDao {
    //根据商品库存ID删除该条库存记录
    int deleteByPrimaryKey(Integer stockid);

    //添加一条库存记录
    int insert(Stock record);

    //添加一条库存记录（参数可变）
    int insertSelective(Stock record);

    //根据库存ID查询库存信息
    Stock selectByPrimaryKey(Integer stockid);

    //根据库存ID修改库存信息
    int updateByPrimaryKeySelective(Stock record);

    //根据库存ID修改库存信息（参数可变）
    int updateByPrimaryKey(Stock record);
}