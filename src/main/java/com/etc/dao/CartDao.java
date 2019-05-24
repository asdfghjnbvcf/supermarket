package com.etc.dao;

import com.etc.entity.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.CartDao
 * 描述：购物车持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 18:24
 */
@Repository
@Mapper
public interface CartDao {
    //根据购物车ID删除该条记录
    int deleteByPrimaryKey(Integer cartid);

    //添加一条购物车记录
    int insert(Cart record);

    //添加一条购物车记录（参数可变）
    int insertSelective(Cart record);

    //根据购物车ID查询该购物车信息
    Cart selectByPrimaryKey(Integer cartid);

    //根据购物车ID修改购物车信息
    int updateByPrimaryKeySelective(Cart record);

    //根据购物车ID修改购物车信息（参数可变）
    int updateByPrimaryKey(Cart record);
}