package com.etc.entity;

import java.util.List;
public class TwoLevel {
    private Integer twolevelid;
    private Integer onelevelid;
    private String onelevelname;
    private String twolevelname;

    public String getOnelevelname () {
        return onelevelname;
    }

    public void setOnelevelname ( String onelevelname ) {
        this.onelevelname = onelevelname;
    }

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
                ", onelevelname='" + onelevelname + '\'' +
                ", twolevelname='" + twolevelname + '\'' +
                '}';
    }

    public TwoLevel ( Integer twolevelid, Integer onelevelid, String twolevelname ) {
        this.twolevelid = twolevelid;
        this.onelevelid = onelevelid;
        this.twolevelname = twolevelname;
    }

    public TwoLevel ( Integer twolevelid, Integer onelevelid, String onelevelname, String twolevelname ) {
        this.twolevelid = twolevelid;
        this.onelevelid = onelevelid;
        this.onelevelname = onelevelname;
        this.twolevelname = twolevelname;
    }

    public TwoLevel () {
    }
}
