package com.etc.dao;

import com.etc.entity.ThreeLevel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.ThreeLevelDao
 * 描述：第三级分类持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface ThreeLevelDao {
    //根据第三级分类ID删除该记录
    int deleteByPrimaryKey(Integer threelevelid);

    //添加一条记录
    int insert(ThreeLevel record);

    //添加一条记录（参数可变）
    int insertSelective(ThreeLevel record);

    //根据第三级分类ID查询该分类的信息
    ThreeLevel selectByPrimaryKey(Integer threelevelid);

    //根据第三级分类的ID修改该分类信息
    int updateByPrimaryKeySelective(ThreeLevel record);

    //根据第三级分类ID修改该分类信息（参数可变）
    int updateByPrimaryKey(ThreeLevel record);
}