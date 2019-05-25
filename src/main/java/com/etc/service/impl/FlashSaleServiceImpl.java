package com.etc.service.impl;

import com.etc.dao.FlashSaleDao;
import com.etc.entity.FlashSale;
import com.etc.redis.FlashSaleKey;
import com.etc.redis.RedisService;
import com.etc.service.FlashSaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 文件名:com.etc.service.impl
 * 描述：
 * 作者:吴仕泉
 * 时间:2019/5/24 2:15
 */
@Service
public class FlashSaleServiceImpl implements FlashSaleService {

    @Autowired
    FlashSaleDao flashSaleDao;

    @Autowired
    RedisService redisService;

    //查询今日的所有秒杀活动
    @Override
    public List<FlashSale> selectTodaySale() {
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        // new Date()为获取当前系统时间
        String daykey = df.format(new Date());
        //获取redis缓存中今日活动的数据
        List<FlashSale> lfs = redisService.getList(FlashSaleKey.todayFlashSaleKey,daykey);
        if(lfs==null||lfs.size()<=0){
           //调用数据库
            List<FlashSale> listfs = flashSaleDao.listTodaySale();
            if(listfs != null&&listfs.size()>0){
                //把数据保存在redis缓存中
                redisService.setList(FlashSaleKey.todayFlashSaleKey,daykey,listfs);
                return listfs;
            }
            return null;
        }
        return lfs;
    }
}
