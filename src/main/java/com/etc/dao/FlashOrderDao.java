package com.etc.dao;

import com.etc.entity.FlashOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.FlashOrderDao
 * 描述：秒杀订单持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface FlashOrderDao {
    //根据秒杀订单ID删除该订单记录
    int deleteByPrimaryKey(Integer flashorderid);

    //添加一条秒杀订单记录
    int insert(FlashOrder record);

    //添加一条秒杀订单记录（参数可变）
    int insertSelective(FlashOrder record);

    //根据秒杀订单ID查询秒杀订单信息
    FlashOrder selectByPrimaryKey(Integer flashorderid);

    //根据秒杀订单ID修改记录信息
    int updateByPrimaryKeySelective(FlashOrder record);

    //根据秒杀订单ID修改记录信息（参数可变）
    int updateByPrimaryKey(FlashOrder record);
}