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
import com.etc.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    //注入用户操作的持久层对象
    @Autowired
    private UserDao userDao;

    /**
     * 根据手机号查询数据库中是否存在用户
     * @param userPhone 要查询的手机号
     * @return 用户是否存在
     */
    @Override
    public User getUserByUserPhone(String userPhone) {

        //调用持久层对象根据userphone查询用户
       User user =  userDao.getUserByUserPhone(userPhone);

           return user;
    }

    /**
     * 用户注册的service层方法
     * @param user
     * @return
     */
    @Override
    public boolean saveUser(User user) {

        //将密码进行md5加密
        user.setUserpassword(MD5Util.getEncodeByMd5(user.getUserpassword()));

        //设置注册时间
        user.setUserregisday(new Date());

        return userDao.saveUser(user);
    }


    /**
     * 用户登录查询用户信息的方法
     * @param userphone  用户的手机号
     * @param userpassword 用户的密码
     * @return 查询到的用户信息
     */
    @Override
    public User getUserByUserPhoneAndUserPassword(String userphone, String userpassword) {
        String iuserpassword =  MD5Util.getEncodeByMd5(userpassword);

        return userDao.getUserByUserPhoneAndUserPassword(userphone,iuserpassword);
    }


}
