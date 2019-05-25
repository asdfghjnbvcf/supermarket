package com.etc.dao;

import com.etc.entity.PhoneCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.PhoneCodeDao
 * 描述：手机验证持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:14
 */
@Repository
@Mapper
public interface PhoneCodeDao {
    //根据手机验证ID删除该条记录
    int deleteByPrimaryKey(Integer id);

    //添加一条记录
    int insert(PhoneCode record);

    //添加一条记录（参数可变）
    int insertSelective(PhoneCode record);

    //根据手机验证ID查询该手机验证信息
    PhoneCode selectByPrimaryKey(Integer id);

    //根据手机验证ID修改手机验证信息
    int updateByPrimaryKeySelective(PhoneCode record);

    //根据手机验证ID修改手机验证信息（参数可变）
    int updateByPrimaryKey(PhoneCode record);

    //添加验证码
    boolean savePhoneCode(PhoneCode phoneCode);

    //根据phone和code删除PhoneCode
    boolean deletePhoneCodeByPhone(@Param("phone") String phone ,@Param("code") String code);

    //根据phone和code查询PhoneCode
    PhoneCode selectPhoneCodeByPhoneAndCode(@Param("phone") String phone, @Param("code") String code);
}