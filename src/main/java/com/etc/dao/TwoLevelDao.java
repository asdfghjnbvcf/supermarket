package com.etc.dao;

import com.etc.entity.OneLevel;
import com.etc.entity.TwoLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TwoLevelDao {
     List<TwoLevel> listTwoLevel ();
     TwoLevel getTwoLevelById(Integer twolevelid);
     List<TwoLevel> listTwoLevelByPage( @Param("start") int start, @Param("pageSize")int pageSize, @Param("content")String content);
     Integer getTotal(@Param("content")String content);
     Integer updateByPrimaryKey( TwoLevel twoLevel);
}
