package com.etc.dao;

import com.etc.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件名:com.etc.entity.EmployeeDao
 * 描述：员工持久层接口
 * 作者:吴仕泉
 * 时间:2019/5/23 19:24
 */
@Repository
@Mapper
public interface EmployeeDao {
    //根据员工ID删除该员工记录
    int deleteByPrimaryKey(Integer empid);

    //添加一条员工记录
    int insert(Employee record);

    //添加一条员工记录（参数可变）
    int insertSelective(Employee record);

    //根据员工ID查询该员工信息
    Employee selectByPrimaryKey(Integer empid);

    //根据员工ID修改员工信息
    int updateByPrimaryKeySelective(Employee record);

    //根据员工ID修改员工信息（参数可变）
    int updateByPrimaryKey(Employee record);
}