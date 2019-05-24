package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.City
 * 描述：城市实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:28
 */
public class City implements Serializable{
    //城市ID
    private Long id;

    //城市编号
    private Integer cityid;

    //城市名
    private String cityname;

    //所属省份编号
    private Long parentid;

    public City() {
    }

    public City(Long id, Integer cityid, String cityname, Long parentid) {
        this.id = id;
        this.cityid = cityid;
        this.cityname = cityname;
        this.parentid = parentid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityid=" + cityid +
                ", cityname='" + cityname + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}