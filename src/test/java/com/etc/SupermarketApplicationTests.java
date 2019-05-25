package com.etc;



import com.etc.dao.*;
import com.etc.entity.FlashSale;
import com.etc.entity.po.FlashGoodsMessagePo;
import com.etc.entity.po.FlashGoodsNumPo;
import com.etc.redis.FlashGoodsKey;
import com.etc.redis.RedisService;
import com.etc.service.GoodsService;
import com.etc.service.TwoLevelService;
import com.etc.service.impl.FlashGoodsServiceImpl;
import com.etc.service.impl.FlashSaleServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SupermarketApplicationTests {


    @Test
    public void testredis(){

    }




}
