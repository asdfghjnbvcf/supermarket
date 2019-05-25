package com.etc;

import com.etc.dao.CommentDao;
import com.etc.entity.Comment;
import com.etc.service.CommentService;
import com.etc.utils.PageData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupermarketApplicationTests {

    @Autowired
    private CommentDao commentDao;

    @Autowired
    private CommentService commentService;

    @Test
    public void contextLoads () {
        List<Comment> list = commentService.listAllComment();
        list.forEach(System.out::println);
    }

    @Test
    public void contextLoads02 () {
        List<Comment> list = commentDao.selectCommentByPage(1,3,"");
        System.out.println("*******************");
        list.forEach(System.out::println);
        System.out.println("*******************");
    }

    @Test
    public void contextLoads03 () {
        int n = commentDao.deleteByPrimaryKey(12);
        if (n>0){
            System.out.println("删除成功");
        }
    }



}
