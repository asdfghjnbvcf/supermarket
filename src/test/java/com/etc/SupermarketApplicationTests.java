package com.etc;

import com.etc.dao.AreaDao;
import com.etc.dao.FlashSaleDao;
import com.etc.dao.OrdersDao;
import com.etc.entity.FlashSale;
import com.etc.entity.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Target;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupermarketApplicationTests {

    @Autowired
    AreaDao areaDao;

    @Autowired
    OrdersDao ordersDao;

    @Autowired
    FlashSaleDao flashSaleDao;

    //测试ID为20 的地区信息
    @Test
    public void contextLoads () {
        System.out.println(areaDao.selectByPrimaryKey(20L));
    }

    //测试ID为1的订单
    @Test
    public void testOrderDao () {

        System.out.println(ordersDao.selectByPrimaryKey(1));
    }

    //测试今日所有秒杀活动
    @Test
    public void testlistTodaySale(){
        List<FlashSale> list = flashSaleDao.listTodaySale();
        list.forEach(System.out::println);
    }

}
