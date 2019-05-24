package com.etc.dao;

import com.etc.entity.FlashSale;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文件名:com.etc.entity.FlashSaleDao
 * 描述：秒杀活动持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface FlashSaleDao {
    //根据秒杀活动ID删除秒杀活动
    int deleteByPrimaryKey(Integer flashsaleid);

    //添加一条秒杀活动记录
    int insert(FlashSale record);

    //添加一条秒杀活动记录（参数可变）
    int insertSelective(FlashSale record);

    //根据秒杀活动ID查询秒杀活动信息
    FlashSale selectByPrimaryKey(Integer flashsaleid);

    //根据秒杀活动ID修改秒杀活动信息
    int updateByPrimaryKeySelective(FlashSale record);

    //根据秒杀活动ID修改秒杀活动信息（参数可变）
    int updateByPrimaryKey(FlashSale record);

    //根据系统日期获取今日所有的秒杀活动
    List<FlashSale> listTodaySale();
}