package com.etc.dao;

import com.etc.entity.Goods;
import com.etc.entity.TwoLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文件名:com.etc.entity.GoodsDao
 * 描述：商品持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface GoodsDao {
    //根据商品ID删除商品记录
    int deleteByPrimaryKey(Integer goodsid);

    //添加一条商品记录
    int insert(Goods record);

    //添加一条商品记录（参数可变）
    int insertSelective(Goods record);

    //根据商品ID查询商品信息
    Goods selectByPrimaryKey(Integer goodsid);

    //根据商品ID修改商品信息
    int updateByPrimaryKeySelective(Goods record);

    //根据商品ID修改商品信息（参数可变）
    int updateByPrimaryKey(Goods record);

    //得到所有商品并分页查询
    List<Goods> listGoodsByPage( @Param("start") int start, @Param("pageSize")int pageSize, @Param("content")String content);

    //得到所有商品并分页查询
    int getTotal(String content);
}