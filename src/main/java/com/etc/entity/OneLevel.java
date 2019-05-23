package com.etc.entity;

/**
 * 一级分类的实体类
 * 蒋丽娟
 */
public class OneLevel {
    private Integer oneLevelId;

    private String oneLevelName;

    public Integer getOneLevelId () {
        return oneLevelId;
    }

    public void setOneLevelId ( Integer oneLevelId ) {
        this.oneLevelId = oneLevelId;
    }

    public String getOneLevelName () {
        return oneLevelName;
    }

    public void setOneLevelName ( String oneLevelName ) {
        this.oneLevelName = oneLevelName;
    }
    @Override
    public String toString () {
        return "OneLevel{" +
                "oneLevelId=" + oneLevelId +
                ", oneLevelName='" + oneLevelName + '\'' +
                '}';
    }

    public OneLevel () {
    }

    public OneLevel ( Integer oneLevelId, String oneLevelName ) {
        this.oneLevelId = oneLevelId;
        this.oneLevelName = oneLevelName;
    }

}
