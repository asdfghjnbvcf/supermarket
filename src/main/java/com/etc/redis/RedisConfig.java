package com.etc.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 文件名:com.etc.redis.RedisConfig
 * 描述：设置redis属性
 * 作者:吴仕泉
 * 时间:2019/5/23 23:54
 */
@Component
@ConfigurationProperties(prefix="redis")
public class RedisConfig {
    //主机地址
    private String host;

    //端口
    private int port;

    //过期时间（秒）
    private int timeout;

    //密码
    private String password;

    //缓存池最大容量
    private int poolMaxTotal;

    //最大闲置
    private int poolMaxIdle;

    //最大等待时间（秒）
    private int poolMaxWait;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public int getTimeout() {
        return timeout;
    }
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getPoolMaxTotal() {
        return poolMaxTotal;
    }
    public void setPoolMaxTotal(int poolMaxTotal) {
        this.poolMaxTotal = poolMaxTotal;
    }
    public int getPoolMaxIdle() {
        return poolMaxIdle;
    }
    public void setPoolMaxIdle(int poolMaxIdle) {
        this.poolMaxIdle = poolMaxIdle;
    }
    public int getPoolMaxWait() {
        return poolMaxWait;
    }
    public void setPoolMaxWait(int poolMaxWait) {
        this.poolMaxWait = poolMaxWait;
    }
}
