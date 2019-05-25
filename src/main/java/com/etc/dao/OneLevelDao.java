package com.etc.dao;

import com.etc.entity.OneLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OneLevelDao {
     //得到所有的一级分类
     List<OneLevel> listOneLevel();
     //得到一级分类分页
     List<OneLevel> listOneLevelByPage( @Param("start") int start, @Param("pageSize")int pageSize, @Param("content")String content);
     //统计模糊查询后的总条数
     Integer getTotal(String content);
     //根据id修改一级分类的名称
     Integer updateByPrimaryKey( OneLevel oneLevel);
}
