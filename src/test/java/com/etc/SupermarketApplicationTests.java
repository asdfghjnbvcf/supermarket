package com.etc;


import com.etc.dao.TwoLevelDao;
import com.etc.service.GoodsService;
import com.etc.service.TwoLevelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupermarketApplicationTests {
    @Autowired
    private TwoLevelService twoLevelService;
    @Autowired
    private TwoLevelDao twoLevelDao;
    @Autowired
    private GoodsService goodsService;
    @Test
    public void contextLoads () {
        goodsService.listGoodsByPage(1,5,"").getData().forEach(System.out::println);

    }


}
