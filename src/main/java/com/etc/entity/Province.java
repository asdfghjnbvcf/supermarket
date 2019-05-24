package com.etc.entity;

import java.io.Serializable;

/**
 * 文件名:com.etc.entity.Province
 * 描述：省份实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 18:28
 */
public class Province implements Serializable{
    //省份ID
    private Long id;

    //省份编号
    private Integer provinceid;

    //省份名
    private String provincename;

    public Province() {
    }

    public Province(Long id, Integer provinceid, String provincename) {
        this.id = id;
        this.provinceid = provinceid;
        this.provincename = provincename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceid=" + provinceid +
                ", provincename='" + provincename + '\'' +
                '}';
    }
}