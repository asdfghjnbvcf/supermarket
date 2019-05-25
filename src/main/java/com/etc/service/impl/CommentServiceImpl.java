package com.etc.service.impl;

import com.etc.dao.CommentDao;
import com.etc.entity.Comment;
import com.etc.service.CommentService;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件名：com.etc.service.impl
 * 描述：
 * 作者：高文乾
 * 时间： 2019/5/24 10:32.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    /**
     * 查询所有数据
     * @return
     */
    @Override
    public List<Comment> listAllComment() {
        return commentDao.selectAllComment();
    }

   @Override
    public PageData<Comment> getCommentsByPage(Integer page, Integer pageSize, String content) {

        //起始位置
        Integer start = (page-1)*pageSize;

        //查询核实数据
        List<Comment> data = commentDao.selectCommentByPage(start,pageSize,content);
        Integer count = commentDao.selectCount(content);
        PageData<Comment> pd = new PageData<>(data,count,pageSize,page);
        return pd;
    }

    /**
     * 根据id删除数据
     * @param commentid
     * @return
     */
    @Override
    public boolean deleteCommentById(Integer commentid) {
        return commentDao.deleteByPrimaryKey(commentid)>0;
    }
}
