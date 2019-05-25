package com.etc.service;

import com.etc.entity.Comment;
import com.etc.utils.PageData;

import java.util.List;

/**
 * 文件名：com.etc.service
 * 描述：
 * 作者：高文乾
 * 时间： 2019/5/24 10:07.
 */
public interface CommentService {

    /**
     * 得到所有数据
     * @return
     */
    public List<Comment> listAllComment();

    /**
     * 分页+模糊查询
     * @param page
     * @param pageSize
     * @param content
     * @return
     */
    public PageData<Comment> getCommentsByPage(Integer page,Integer pageSize,String content);

    /**
     * 删除
     * @param commentid
     * @return
     */
    public boolean deleteCommentById(Integer commentid);

}
