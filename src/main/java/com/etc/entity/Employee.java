package com.etc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 文件名:com.etc.entity.Employee
 * 描述：员工实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:34
 */
public class Employee implements Serializable{
    //员工ID
    private Integer empid;

    //员工名字
    private String empname;

    //员工密码
    private String emppassword;

    //员工电话
    private String empphone;

    //员工性别
    private String empsex;

    //员工入职时间
    private Date empentryday;

    //员工生日
    private Date empbirthday;

    //员工头像路径
    private String emppicture;

    //员工状态（0：在职，1：离职）
    private Integer empstatus;

    public Employee() {
    }

    public Employee(Integer empid, String empname, String emppassword, String empphone, String empsex, Date empentryday, Date empbirthday, String emppicture, Integer empstatus) {
        this.empid = empid;
        this.empname = empname;
        this.emppassword = emppassword;
        this.empphone = empphone;
        this.empsex = empsex;
        this.empentryday = empentryday;
        this.empbirthday = empbirthday;
        this.emppicture = emppicture;
        this.empstatus = empstatus;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmppassword() {
        return emppassword;
    }

    public void setEmppassword(String emppassword) {
        this.emppassword = emppassword == null ? null : emppassword.trim();
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone == null ? null : empphone.trim();
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex == null ? null : empsex.trim();
    }

    public Date getEmpentryday() {
        return empentryday;
    }

    public void setEmpentryday(Date empentryday) {
        this.empentryday = empentryday;
    }

    public Date getEmpbirthday() {
        return empbirthday;
    }

    public void setEmpbirthday(Date empbirthday) {
        this.empbirthday = empbirthday;
    }

    public String getEmppicture() {
        return emppicture;
    }

    public void setEmppicture(String emppicture) {
        this.emppicture = emppicture == null ? null : emppicture.trim();
    }

    public Integer getEmpstatus() {
        return empstatus;
    }

    public void setEmpstatus(Integer empstatus) {
        this.empstatus = empstatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", emppassword='" + emppassword + '\'' +
                ", empphone='" + empphone + '\'' +
                ", empsex='" + empsex + '\'' +
                ", empentryday=" + empentryday +
                ", empbirthday=" + empbirthday +
                ", emppicture='" + emppicture + '\'' +
                ", empstatus=" + empstatus +
                '}';
    }
}