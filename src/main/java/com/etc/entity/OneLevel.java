package com.etc.entity;

import java.io.Serializable;

/**
 * 一级分类的实体类
 * 蒋丽娟
 */
public class OneLevel implements Serializable{
    private Integer onelevelid;

    private String onelevelname;

    @Override
    public String toString () {
        return "OneLevel{" +
                "onelevelid=" + onelevelid +
                ", onelevelname='" + onelevelname + '\'' +
                '}';
    }

    public OneLevel () {
    }

    public Integer getOnelevelid () {
        return onelevelid;
    }

    public void setOnelevelid ( Integer onelevelid ) {
        this.onelevelid = onelevelid;
    }

    public String getOnelevelname () {
        return onelevelname;
    }

    public void setOnelevelname ( String onelevelname ) {
        this.onelevelname = onelevelname;
    }

    public OneLevel ( Integer onelevelid, String onelevelname ) {
        this.onelevelid = onelevelid;
        this.onelevelname = onelevelname;
    }

}
