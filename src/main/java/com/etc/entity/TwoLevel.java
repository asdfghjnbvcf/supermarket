package com.etc.entity;

public class TwoLevel {
    private Integer twolevelid;
    private Integer onelevelid;
    private String twolevelname;

    public Integer getTwolevelid () {
        return twolevelid;
    }

    public void setTwolevelid ( Integer twolevelid ) {
        this.twolevelid = twolevelid;
    }

    public Integer getOnelevelid () {
        return onelevelid;
    }

    public void setOnelevelid ( Integer onelevelid ) {
        this.onelevelid = onelevelid;
    }

    public String getTwolevelname () {
        return twolevelname;
    }

    public void setTwolevelname ( String twolevelname ) {
        this.twolevelname = twolevelname;
    }

    @Override
    public String toString () {
        return "TwoLevel{" +
                "twolevelid=" + twolevelid +
                ", onelevelid=" + onelevelid +
                ", twolevelname='" + twolevelname + '\'' +
                '}';
    }

    public TwoLevel ( Integer twolevelid, Integer onelevelid, String twolevelname ) {
        this.twolevelid = twolevelid;
        this.onelevelid = onelevelid;
        this.twolevelname = twolevelname;
    }

    public TwoLevel () {
    }
}
