package com.etc.dao;

import com.etc.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.CommentDao
 * 描述：评论持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 18:24
 */
@Repository
@Mapper
public interface CommentDao {
    //根据评论ID删除该条记录
    int deleteByPrimaryKey(Integer commentid);

    //添加一条评论记录
    int insert(Comment record);

    //添加一条评论记录（参数可变）
    int insertSelective(Comment record);

    //根据评论ID查询该评论信息
    Comment selectByPrimaryKey(Integer commentid);

    //根据评论ID修改评论信息
    int updateByPrimaryKeySelective(Comment record);

    //根据评论ID修改评论信息（参数可变）
    int updateByPrimaryKey(Comment record);
}