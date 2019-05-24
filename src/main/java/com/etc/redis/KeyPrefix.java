package com.etc.redis;

/**
 * 文件名:com.etc.redis
 * 描述：redis缓存标记前缀接口
 * 作者:吴仕泉
 * 时间:2019/5/23 23:45
 */
public interface KeyPrefix {

    //过去时间
    public int expireSeconds();

    //获取key前缀
    public String getPrefix();
}
