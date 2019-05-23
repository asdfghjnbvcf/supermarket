package com.etc.entity;

public class TwoLevel {
    private Integer twoLevelId;
    private Integer oneLevelId;
    private String twoLevelName;

    public Integer getTwoLevelId () {
        return twoLevelId;
    }

    public void setTwoLevelId ( Integer twoLevelId ) {
        this.twoLevelId = twoLevelId;
    }

    public Integer getOneLevelId () {
        return oneLevelId;
    }

    public void setOneLevelId ( Integer oneLevelId ) {
        this.oneLevelId = oneLevelId;
    }

    public String getTwoLevelName () {
        return twoLevelName;
    }

    public void setTwoLevelName ( String twoLevelName ) {
        this.twoLevelName = twoLevelName;
    }

    @Override
    public String toString () {
        return "TwoLevel{" +
                "twoLevelId=" + twoLevelId +
                ", oneLevelId=" + oneLevelId +
                ", twoLevelName='" + twoLevelName + '\'' +
                '}';
    }

    public TwoLevel ( Integer twoLevelId, Integer oneLevelId, String twoLevelName ) {
        this.twoLevelId = twoLevelId;
        this.oneLevelId = oneLevelId;
        this.twoLevelName = twoLevelName;
    }

    public TwoLevel () {
    }
}
