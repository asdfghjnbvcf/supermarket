package com.etc.dao;

import com.etc.entity.FlashGoods;
import com.etc.entity.po.FlashGoodsMessagePo;
import com.etc.entity.po.FlashGoodsNumPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文件名:com.etc.entity.FlashGoodsDao
 * 描述：秒杀商品持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface FlashGoodsDao {
    //根据秒杀商品ID删除该条记录
    int deleteByPrimaryKey(Integer flashgoodsid);

    //添加一条秒杀商品记录
    int insert(FlashGoods record);

    //添加一条秒杀商品记录（参数可变）
    int insertSelective(FlashGoods record);

    //根据秒杀商品ID查询该秒杀商品信息
    FlashGoods selectByPrimaryKey(Integer flashgoodsid);

    //根据秒杀商品ID修改秒杀商品信息
    int updateByPrimaryKeySelective(FlashGoods record);

    //根据秒杀商品ID修改秒杀商品信息（参数可变）
    int updateByPrimaryKey(FlashGoods record);

    //根据秒杀活动ID查询，参与该活动的所有商品信息
    List<FlashGoodsMessagePo> listSelectFlashGoodsBySaleId(Integer fsid);

    //根据秒杀活动ID，查询参加该活动所有商品的库存
    List<FlashGoodsNumPo> listSelectFlashSaleGoodsNumBySaleId(@Param("fsid") Integer fsid);




}