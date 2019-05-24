package com.etc.dao;

import com.etc.entity.Area;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.AreaDao
 * 描述：城区持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 17:24
 */
@Repository
@Mapper
public interface AreaDao {
    //根据地区ID删除该条记录
    int deleteByPrimaryKey(Long id);

    //添加一条地区记录
    int insert(Area record);

    //添加一条记录（参数可变）
    int insertSelective(Area record);

    //根据地区ID查询地区信息
    Area selectByPrimaryKey(Long id);

    //根据城区ID修改地区信息
    int updateByPrimaryKeySelective(Area record);

    //根据城区ID修改地区信息（参数可变）
    int updateByPrimaryKey(Area record);
}