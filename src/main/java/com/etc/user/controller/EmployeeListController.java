package com.etc.user.controller;/*
 * 文件名：com.etc.user.controller
 * 描述：
 * 作者：施明
 * 时间：2019/5/24 11:25
 */

import com.etc.entity.Employee;
import com.etc.service.EmployeeService;
import com.etc.utils.CommonMessage;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "admin.action")
public class EmployeeListController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "listEmployee")
    @ResponseBody
    public PageData<Employee> listEmployee(Integer page, Integer pageSize, String content){
        if (content == null) {
            content = "";
        }

        PageData<Employee> pd = employeeService.getEmployeeByPage(1, 10, content);
        List<Employee> list = pd.getData();

       pd.setCode(0);
       pd.setMsg("请求成功");
       return pd ;
    }

    @RequestMapping(value = "updateEmployee")
    @ResponseBody
    public CommonMessage updateEmployee(Employee employee){
        CommonMessage commonMessage = new CommonMessage();
        boolean flag = employeeService.updateByPrimaryKey(employee);
        if (flag){
            commonMessage.setMsg("修改成功");
        }else {
            commonMessage.setMsg("操作失败");
        }
        return commonMessage;
    }

    @RequestMapping("delectEmployee")
    public CommonMessage delectEmployee(Integer empid){
        CommonMessage commonMessage = new CommonMessage();
        boolean flag = employeeService.delectByPrimaryKey(empid);
        if (flag){
            commonMessage.setMsg("删除成功");
        }else {
            commonMessage.setMsg("操作失败");
        }
        return commonMessage;

    }

    @RequestMapping("addEmployee")
    public CommonMessage addEmployee(Employee employee){
        CommonMessage commonMessage = new CommonMessage();
        boolean flag = employeeService.insert(employee);
        if (flag){
            commonMessage.setMsg("增加成功");
        }else {
            commonMessage.setMsg("操作失败");
        }
        return commonMessage;

    }
}
