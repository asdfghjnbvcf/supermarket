package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.Area
 * 描述：城区实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:23
 */
public class Area implements Serializable{
    //城区ID
    private Long id;

    //城区编号
    private Integer areaid;

    //城区名字
    private String areaname;

    //所属城市
    private Long parentid;

    public Area() {
    }

    public Area(Long id, Integer areaid, String areaname, Long parentid) {
        this.id = id;
        this.areaid = areaid;
        this.areaname = areaname;
        this.parentid = parentid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", areaid=" + areaid +
                ", areaname='" + areaname + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}