package com.etc.dao;

import com.etc.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.CityDao
 * 描述：城市持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 18:24
 */
@Repository
@Mapper
public interface CityDao {
    //根据城市ID删除该条记录
    int deleteByPrimaryKey(Long id);

    //添加一条城市记录
    int insert(City record);

    //添加一条城市记录（参数可变 ）
    int insertSelective(City record);

    //跟据城市ID查询城市信息
    City selectByPrimaryKey(Long id);

    //根据城市ID修改城市信息
    int updateByPrimaryKeySelective(City record);

    //根据城市ID修改城市信息
    int updateByPrimaryKey(City record);
}