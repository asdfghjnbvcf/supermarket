package com.etc.dao;

import com.etc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.UserDao
 * 描述：用户持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface UserDao {
    //根据用户ID删除用户信息
    int deleteByPrimaryKey(Integer userid);

    //添加一条记录
    int insert(User record);

    //添加一条记录（参数可变）
    int insertSelective(User record);

    //根据用户ID查询用户信息
    User selectByPrimaryKey(Integer userid);

    //根据用户ID修改用户信息
    int updateByPrimaryKeySelective(User record);

    //根据用户ID修改用户信息（参数可变）
    int updateByPrimaryKey(User record);

    //根据手机号码查询用户是否存在
    User getUserByUserPhone(String userphone);

    //用户注册保存信息的方法
    boolean saveUser(User user);
}