package com.etc.service.impl;/*
 * 文件名：com.etc.service.impl
 * 描述：
 * 作者：施明
 * 时间：2019/5/24 10:24
 */

import com.etc.dao.EmployeeDao;
import com.etc.entity.Employee;
import com.etc.service.EmployeeService;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "employee")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public PageData<Employee> getEmployeeByPage(Integer page, Integer pageSize, String content) {
        // 起始位置
        int start =(page - 1) * pageSize;

        // 查询需要返回的数据
        List<Employee> data = employeeDao.selectEmployeeByPage(start, pageSize, content);
        int count = employeeDao.selectCount(content);
        PageData<Employee> pd = new PageData<>(data, count, pageSize, pageSize);
        return pd;
    }

    @Override
    public int employeeCount(String content) {
        return employeeDao.selectCount(content);
    }

    @Override
    public boolean delectByPrimaryKey(Integer empid) {
        return employeeDao.deleteByPrimaryKey(empid)>0;
    }

    @Override
    public boolean insert(Employee employee) {
        return employeeDao.insert(employee)>0;
    }

    @Override
    public boolean updateByPrimaryKey(Employee employee) {
        return employeeDao.updateByPrimaryKey(employee)>0;
    }
}
