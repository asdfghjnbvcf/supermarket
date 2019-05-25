package com.etc.dao;

import com.etc.entity.FlashGoodsStock;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.FlashGoodsStock
 * 描述：秒杀商品库存与销售量持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/24 17:31
 */
@Repository
@Mapper
public interface FlashGoodsStockDao {
    //根据秒杀商品库存ID删除该记录
    int deleteByPrimaryKey(Integer flashgoodsstockid);

    //添加一条记录
    int insert(FlashGoodsStock record);

    //添加一条记录（参数可变）
    int insertSelective(FlashGoodsStock record);

    //根据秒杀商品库存ID查询该记录信息
    FlashGoodsStock selectByPrimaryKey(Integer flashgoodsstockid);

    //根据库存ID修改记录
    int updateByPrimaryKeySelective(FlashGoodsStock record);

    //根据库存ID修改记录（参数可变）
    int updateByPrimaryKey(FlashGoodsStock record);
}