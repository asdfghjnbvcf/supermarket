package com.etc;



import com.etc.dao.FlashGoodsDao;
import com.etc.entity.po.FlashGoodsMessagePo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SupermarketApplicationTests {

    @Autowired
    FlashGoodsDao flashGoodsDao;

    @Test
    public void testredis(){

    }




}
