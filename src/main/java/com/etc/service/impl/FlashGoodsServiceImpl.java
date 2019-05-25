package com.etc.service.impl;

import com.etc.dao.FlashGoodsDao;
import com.etc.entity.FlashSale;
import com.etc.entity.po.FlashGoodsMessagePo;
import com.etc.redis.FlashGoodsKey;
import com.etc.redis.RedisService;
import com.etc.service.FlashGoodsService;
import com.etc.service.FlashSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件名:com.etc.service.impl.FlashGoodsServiceImpl
 * 描述：秒杀商品业务层
 * 作者:吴仕泉
 * 时间:2019/5/24 19:46
 */
@Service
public class FlashGoodsServiceImpl implements FlashGoodsService{

    @Autowired
    FlashGoodsDao flashGoodsDao;
    @Autowired
    RedisService redisService;

    //根据活动ID查询参加该活动的所有商品信息
    @Override
    public List<FlashGoodsMessagePo> selectFlashSaleGoodsMessageBySaleId(Integer saleId) {
        //从redis缓存中获取参加该活动的所有商品信息
        List<FlashGoodsMessagePo> pos=null;
        pos = redisService.getList(FlashGoodsKey.getFlashGoodsList,String.valueOf(saleId));

        if(pos==null||pos.size()<=0){
           // System.out.println("调用数据库2"+saleId);
            pos = flashGoodsDao.listSelectFlashGoodsBySaleId(saleId);
            if (pos!=null && pos.size()>0){
                //添加到缓存中
                redisService.setList(FlashGoodsKey.getFlashGoodsList,String.valueOf(saleId),pos);
            }
        }

        return pos;
    }
}
