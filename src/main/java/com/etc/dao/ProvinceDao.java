package com.etc.dao;

import com.etc.entity.Province;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.ProvinceDao
 * 描述：省份持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface ProvinceDao {
    //根据省份ID删除该省份记录
    int deleteByPrimaryKey(Long id);

    //添加一条省份记录
    int insert(Province record);

    //添加一条省份记录（参数可变）
    int insertSelective(Province record);

    //根据省份ID查询该省份信息
    Province selectByPrimaryKey(Long id);

    //根据省份ID修改省份信息
    int updateByPrimaryKeySelective(Province record);

    //根据省份ID修改省份信息（参数可变）
    int updateByPrimaryKey(Province record);
}