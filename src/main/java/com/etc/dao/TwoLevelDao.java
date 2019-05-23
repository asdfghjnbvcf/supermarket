package com.etc.dao;

import com.etc.entity.TwoLevel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TwoLevelDao {
     List<TwoLevel> listTwoLevel ();
}
