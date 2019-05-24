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
     List<OneLevel> listOneLevel();
     List<OneLevel> listOneLevelByPage( @Param("start") int start, @Param("pageSize")int pageSize, @Param("content")String content);
     Integer getTotal(String content);
     Integer updateByPrimaryKey( OneLevel oneLevel);
}
