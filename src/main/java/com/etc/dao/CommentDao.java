package com.etc.dao;

import com.etc.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    //查询所有评论记录
    List<Comment> selectAllComment();

    /**
     * 分页+模糊查询
     * @param start
     * @param pageSize
     * @param content
     * @return
     */
    List<Comment> selectCommentByPage(@Param("start") Integer start, @Param("pageSize") Integer pageSize,
                                      @Param("content") String content);

    /**
     * 查询瞒住条件的记录数
     * @param content
     * @return
     */
    int selectCount(@Param("content") String content);
}