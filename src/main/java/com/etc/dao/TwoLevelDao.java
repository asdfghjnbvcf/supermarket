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
     //得到所有二级分类下的集合
     List<TwoLevel> listTwoLevel ();
     //通过二级id查找单个记录
     TwoLevel getTwoLevelById(Integer twolevelid);
     //得到所有并分页
     List<TwoLevel> listTwoLevelByPage( @Param("start") int start, @Param("pageSize")int pageSize, @Param("content")String content);
     //得到模糊查询后集合的总数
     Integer getTotal(@Param("content")String content);
     //修改二级分类下的名称
     Integer updateByPrimaryKey( TwoLevel twoLevel);
     //得到一级id下的二级商品集合
     List<TwoLevel> listTwoLevelByOneLeveId(Integer onelevelid);
}
