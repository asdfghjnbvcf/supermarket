package com.etc.dao;

import com.etc.entity.OrderList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.OrderListDao
 * 描述：订单项持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface OrderListDao {
    //根据订单项ID删除该订单项信息
    int deleteByPrimaryKey(Integer orderlistid);

    //添加一条订单项记录
    int insert(OrderList record);

    //添加一条订单项记录信息
    int insertSelective(OrderList record);

    //根据订单项ID查询该订单项信息
    OrderList selectByPrimaryKey(Integer orderlistid);

    //根据订单项ID修改该记录
    int updateByPrimaryKeySelective(OrderList record);

    //根据订单项ID修改该记录（参数可变）
    int updateByPrimaryKey(OrderList record);
}