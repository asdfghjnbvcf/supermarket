package com.etc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 文件名:com.etc.entity.FlashSale
 * 描述：秒杀活动实体类
 * 作者:吴仕泉
 * 时间:2019/5/23 17:48
 */
public class FlashSale implements Serializable{
    //秒杀ID
    private Integer flashsaleid;

    //秒杀活动名称
    private String flashsalename;

    //秒杀开始时间
    private Date flashstarttime;

    //秒杀结束时间
    private Date flashendtime;

    public FlashSale() {
    }

    public FlashSale(Integer flashsaleid, String flashsalename, Date flashstarttime, Date flashendtime) {
        this.flashsaleid = flashsaleid;
        this.flashsalename = flashsalename;
        this.flashstarttime = flashstarttime;
        this.flashendtime = flashendtime;
    }

    public Integer getFlashsaleid() {
        return flashsaleid;
    }

    public void setFlashsaleid(Integer flashsaleid) {
        this.flashsaleid = flashsaleid;
    }

    public String getFlashsalename() {
        return flashsalename;
    }

    public void setFlashsalename(String flashsalename) {
        this.flashsalename = flashsalename == null ? null : flashsalename.trim();
    }

    public Date getFlashstarttime() {
        return flashstarttime;
    }

    public void setFlashstarttime(Date flashstarttime) {
        this.flashstarttime = flashstarttime;
    }

    public Date getFlashendtime() {
        return flashendtime;
    }

    public void setFlashendtime(Date flashendtime) {
        this.flashendtime = flashendtime;
    }

    @Override
    public String toString() {
        return "FlashSale{" +
                "flashsaleid=" + flashsaleid +
                ", flashsalename='" + flashsalename + '\'' +
                ", flashstarttime=" + flashstarttime +
                ", flashendtime=" + flashendtime +
                '}';
    }
}