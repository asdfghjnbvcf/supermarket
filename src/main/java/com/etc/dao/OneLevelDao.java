package com.etc.dao;

import com.etc.entity.OneLevel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface OneLevelDao {
     List<OneLevel> listOneLevel();
}
