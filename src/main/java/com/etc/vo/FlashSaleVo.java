package com.etc.vo;

import java.io.Serializable;


/**
 * 文件名:com.etc.vo
 * 描述：
 * 作者:吴仕泉
 * 时间:2019/5/24 18:27
 */
public class FlashSaleVo implements Serializable{
    //秒杀ID
    private Integer flashsaleid;

    //秒杀活动名称
    private String flashsalename;

    //秒杀开始时间
    private String  flashstarttime;

    //秒杀结束时间
    private String flashendtime;

    public FlashSaleVo() {
    }

    public FlashSaleVo(Integer flashsaleid, String flashsalename, String flashstarttime, String flashendtime) {
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
        this.flashsalename = flashsalename;
    }

    public String getFlashstarttime() {
        return flashstarttime;
    }

    public void setFlashstarttime(String flashstarttime) {
        this.flashstarttime = flashstarttime;
    }

    public String getFlashendtime() {
        return flashendtime;
    }

    public void setFlashendtime(String flashendtime) {
        this.flashendtime = flashendtime;
    }

    @Override
    public String toString() {
        return "FlashSaleVo{" +
                "flashsaleid=" + flashsaleid +
                ", flashsalename='" + flashsalename + '\'' +
                ", flashstarttime='" + flashstarttime + '\'' +
                ", flashendtime='" + flashendtime + '\'' +
                '}';
    }
}
