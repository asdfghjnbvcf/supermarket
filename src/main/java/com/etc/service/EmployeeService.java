package com.etc.service;/*
 * 文件名：com.etc.service
 * 描述：
 * 作者：施明
 * 时间：2019/5/24 9:57
 */

import com.etc.entity.Employee;
import com.etc.utils.PageData;


public interface EmployeeService {
    /**
     * 分页加模糊
     * @param page 开始
     * @param pageSize 页条数
     * @param content 模糊查询
     * @return
     */
    public PageData<Employee> getEmployeeByPage(Integer page, Integer pageSize, String content);

    /**
     * 总记录数
     * @return
     */
    int employeeCount(String content);
    /**
     * 根据id删除
     * @param empid
     * @return
     */
    boolean delectByPrimaryKey(Integer empid);

    /**
     * 插入一个员工
     * @param employee
     * @return
     */
    boolean insert(Employee employee);

    /**
     * 修改
     * @param employee
     * @return
     */
    boolean updateByPrimaryKey(Employee employee);


}
