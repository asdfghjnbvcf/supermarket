package com.etc.dao;

import com.etc.entity.Chat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.ChatDao
 * 描述：聊天持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 18:24
 */
@Repository
@Mapper
public interface ChatDao {
    //根据聊天ID删除该记录
    int deleteByPrimaryKey(Integer userchatid);

    //添加一条聊天记录
    int insert(Chat record);

    //添加一条聊天记录（参数可变）
    int insertSelective(Chat record);

    //根据聊天记录ID查询该记录信息
    Chat selectByPrimaryKey(Integer userchatid);

    //根据聊天记录ID修改聊天记录
    int updateByPrimaryKeySelective(Chat record);

    //根据聊天记录ID修改聊天记录（参数可变）
    int updateByPrimaryKey(Chat record);
}