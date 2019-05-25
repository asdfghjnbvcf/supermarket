package com.etc.redis;

/**
 * 文件名:com.etc.redis.FlashGoodsKey
 * 描述：秒杀商品保存在缓存中的key的前缀
 * 作者:吴仕泉
 * 时间:2019/5/24 0:21
 */
public class FlashGoodsKey extends BasePrefix{

    private  FlashGoodsKey(int expireSeconds, String prefix){
        super(expireSeconds,prefix);
    }

    //秒杀商品列表前缀与过期时间
    public static FlashGoodsKey  getFlashGoodsList = new FlashGoodsKey(25, "fgl");

    //秒杀商品详情前缀与过期时间
    public static FlashGoodsKey  getFlashGoodsDetail = new FlashGoodsKey(60, "fgd");

    //秒杀商品库存
    public static FlashGoodsKey  getFlashGoodsStock = new FlashGoodsKey(0, "fgs");

}
