package com.etc.dao;

import com.etc.entity.GoodsPicture;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.GoodsPictureDao
 * 描述：商品价格持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface GoodsPictureDao {
    //根据商品价格ID删除该记录
    int deleteByPrimaryKey(Integer pictureid);

    //添加一条商品价格记录
    int insert(GoodsPicture record);

    //添加一条商品价格记录（参数可变）
    int insertSelective(GoodsPicture record);

    //根据商品价格ID查询该商品价格信息
    GoodsPicture selectByPrimaryKey(Integer pictureid);

    //根据商品价格ID修改商品价格信息
    int updateByPrimaryKeySelective(GoodsPicture record);

    //跟据商品价格ID修改商品价格信息（参数可变）
    int updateByPrimaryKey(GoodsPicture record);
}