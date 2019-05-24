package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.Stock
 * 描述：商品第三级分类实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 18:22
 */
public class ThreeLevel implements Serializable{
    //第三级分类ID
    private Integer threelevelid;

    //第二级分类ID
    private Integer twolevelid;

    //第三级分类名
    private String threelevelname;

    public ThreeLevel() {
    }

    public ThreeLevel(Integer threelevelid, Integer twolevelid, String threelevelname) {
        this.threelevelid = threelevelid;
        this.twolevelid = twolevelid;
        this.threelevelname = threelevelname;
    }

    public Integer getThreelevelid() {
        return threelevelid;
    }

    public void setThreelevelid(Integer threelevelid) {
        this.threelevelid = threelevelid;
    }

    public Integer getTwolevelid() {
        return twolevelid;
    }

    public void setTwolevelid(Integer twolevelid) {
        this.twolevelid = twolevelid;
    }

    public String getThreelevelname() {
        return threelevelname;
    }

    public void setThreelevelname(String threelevelname) {
        this.threelevelname = threelevelname == null ? null : threelevelname.trim();
    }

    @Override
    public String toString() {
        return "ThreeLevel{" +
                "threelevelid=" + threelevelid +
                ", twolevelid=" + twolevelid +
                ", threelevelname='" + threelevelname + '\'' +
                '}';
    }
}