package com.etc.service;
/*
 * 文件名：com.etc.service.UserService
 * 描述：用户操作的service接口
 * 作者：黄志鹏
 * 时间：2019/5/24 9:27
 */

import com.etc.entity.User;

public interface UserService {
    /**
     * 根据手机号码查询用户是否存在
     * @param userPhone 要查询的手机号
     * @return 是否存在该手机号的用户
     */
    User getUserByUserPhone(String userPhone);

    /**
     * 用户注册的方法
     * @param user 用户信息
     * @return 是否成功
     */
    boolean saveUser(User user);

    /**
     * 用户登录中查询用户的方法
     * @param userphone  用户的手机号
     * @param userpassword 用户的密码
     * @return 查询到的用户
     */
    User getUserByUserPhoneAndUserPassword(String userphone, String userpassword);


}
