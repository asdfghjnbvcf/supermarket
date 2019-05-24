package com.etc.dao;

import com.etc.entity.CartList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.CartlistDao
 * 描述：购物车项持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 18:24
 */
@Repository
@Mapper
public interface CartlistDao {
    //根据购物车项ID删除该条记录
    int deleteByPrimaryKey(Integer cartlistid);

    //添加一条购物车项记录
    int insert(CartList record);

    //添加一条购物车项记录（参数可变）
    int insertSelective(CartList record);

    //根据购物车项ID查询该购物车项信息
    CartList selectByPrimaryKey(Integer cartlistid);

    //根据购物车项目ID修改该购物车项信息
    int updateByPrimaryKeySelective(CartList record);

    //根据购物车项ID修改该购物车项目信息（参数可变）
    int updateByPrimaryKey(CartList record);
}