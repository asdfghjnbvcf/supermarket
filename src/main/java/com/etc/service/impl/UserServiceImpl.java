package com.etc.service.impl;
/*
 * 文件名：com.etc.service.impl.UserServiceImpl
 * 描述：用户操作的service接口的实现类
 * 作者：黄志鹏
 * 时间：2019/5/24 9:28
 */

import com.etc.dao.UserDao;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    //注入用户操作的持久层对象
    @Autowired
    private UserDao userDao;

    @Override
    public boolean getUserByUserPhone(String userPhone) {

        //调用持久层对象根据userphone查询用户
       User user =  userDao.getUserByUserPhone(userPhone);

       //判断用户用户是否存在
       if (user!=null){
           //用户存在返回true
           return true;
       }
       //用户不存在返回false
        return false;
    }
}
