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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "admin.action")
public class EmployeeListController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "listEmployee")
    @ResponseBody
    public PageData<Employee> listEmployee(Integer page, Integer limit, String content){
        if (content == null) {
            content = "";
        }

        PageData<Employee> pd = employeeService.getEmployeeByPage(page, limit, content);
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

    @RequestMapping(value = "delectEmployee", method = RequestMethod.POST)
    @ResponseBody
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

    @RequestMapping(value = "addEmployee",method = RequestMethod.POST)
    @ResponseBody
    public CommonMessage addEmployee(@RequestBody Employee employee){
        Employee emp = new Employee();
        emp.setEmpid(null);
        emp.setEmpname(employee.getEmpname());
        emp.setEmppassword(employee.getEmppassword());
        emp.setEmpsex(employee.getEmpsex());
        emp.setEmpphone(employee.getEmpphone());
        emp.setEmpentryday(employee.getEmpentryday());
        emp.setEmpbirthday(employee.getEmpbirthday());
        emp.setEmppicture(employee.getEmppicture());
        emp.setEmpstatus(employee.getEmpstatus());
        CommonMessage commonMessage = new CommonMessage();
        boolean flag = employeeService.insert(emp);
        if (flag){
            commonMessage.setMsg("增加成功");
        }else {
            commonMessage.setMsg("操作失败");
        }
        return commonMessage;

    }
}
