package com.etc.redis;

/**
 * 文件名:com.etc.redis.BasePrefix
 * 描述：
 * 作者:吴仕泉
 * 时间:2019/5/23 23:48
 */
public abstract class BasePrefix implements KeyPrefix{

    //过期时间
    private int expireSeconds;

    //前缀
    private String prefix;

    //0代表永不过期
    public BasePrefix(String prefix) {
        this(0, prefix);
    }

    public BasePrefix( int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    //默认0代表永不过期,获取过期时间
    public int expireSeconds() {
        return expireSeconds;
    }

    //获取前缀
    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className+":" + prefix;
    }
}
