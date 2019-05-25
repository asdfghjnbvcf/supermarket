package com.etc.user.controller;

import com.etc.entity.FlashSale;
import com.etc.result.CodeMsg;
import com.etc.result.Result;
import com.etc.service.FlashSaleService;
import com.etc.vo.FlashSaleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件名:com.etc.user.controller.FlashSaleController
 * 描述：秒杀活动控制器
 * 作者:吴仕泉
 * 时间:2019/5/24 11:03
 */
@Controller
@RequestMapping("flashSale.action")
public class FlashSaleController {

    @Autowired
    FlashSaleService flashSaleService;

    //获取今日活动
    @RequestMapping("todayFlashSale")
    @ResponseBody
    public Result<FlashSaleVo> getTodayFlashSale(){
        List<FlashSale> list= flashSaleService.selectTodaySale();

       // list.forEach(System.out::println);
        if(list==null||list.size()<=0){
            return Result.error(CodeMsg.FLASH_SALE_NULL);
        }
        List<FlashSaleVo> voList = new ArrayList<>();
        //转化为前端所需格式
        for(int i = 0;i < list.size(); i++){
            FlashSaleVo  vo = new FlashSaleVo();
            vo.setFlashsaleid(list.get(i).getFlashsaleid());
            vo.setFlashsalename(list.get(i).getFlashsalename());
            //将date格式转为时间戳格式
            vo.setFlashstarttime(String.valueOf(list.get(i).getFlashstarttime().getTime()));
            vo.setFlashendtime(String.valueOf(list.get(i).getFlashendtime().getTime()));
            voList.add(vo);
        }

       return Result.success(voList);
    }
}
