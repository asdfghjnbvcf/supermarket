package com.etc.dao;

import com.etc.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.OrdersDao
 * 描述：订单持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface OrdersDao {
    //根据订单ID删除该订单
    int deleteByPrimaryKey(Integer orderid);

    //添加一条订单记录
    int insert(Orders record);

    //添加一条订单记录（参数可变）
    int insertSelective(Orders record);

    //根据订单ID查询订单信息
    Orders selectByPrimaryKey(Integer orderid);

    //根据订单ID修改订单信息
    int updateByPrimaryKeySelective(Orders record);

    //根据订单ID修改订单信息（参数可变）
    int updateByPrimaryKey(Orders record);
}