package com.etc.redis;

import com.etc.entity.FlashSale;

/**
 * 文件名:com.etc.redis
 * 描述：
 * 作者:吴仕泉
 * 时间:2019/5/24 10:10
 */
public class FlashSaleKey extends BasePrefix {
    private FlashSaleKey(int expireSeconds, String prefix){
        super( expireSeconds,prefix);
    }

    //今日秒杀活动前缀与过期时间(1小时)
    public static FlashSaleKey todayFlashSaleKey = new FlashSaleKey(3600,"tfsk");

}
