package com.etc.dao;

import com.etc.entity.UserAddress;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.UserAddressDao
 * 描述：用户地址持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface UserAddressDao {
    //根据用户地址ID删除用户地址
    int deleteByPrimaryKey(Integer addressid);

    //添加一条用户地址记录
    int insert(UserAddress record);

    //添加一条用户地址记录（参数可变）
    int insertSelective(UserAddress record);

    //根据用户地址ID查询用户地址信息
    UserAddress selectByPrimaryKey(Integer addressid);

    //根据用户地址ID修改该记录
    int updateByPrimaryKeySelective(UserAddress record);

    //根据用户地址ID修改该记录（参数可变）
    int updateByPrimaryKey(UserAddress record);
}