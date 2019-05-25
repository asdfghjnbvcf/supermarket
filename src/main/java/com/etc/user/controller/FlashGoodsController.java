package com.etc.user.controller;

import com.etc.entity.po.FlashGoodsMessagePo;
import com.etc.result.CodeMsg;
import com.etc.result.Result;
import com.etc.service.FlashGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 文件名:com.etc.user.controller.FlashGoodsController
 * 描述：秒杀商品控制器
 * 作者:吴仕泉
 * 时间:2019/5/24 20:04
 */
@Controller
@RequestMapping("flashgoods.action")
public class FlashGoodsController {

    @Autowired
    FlashGoodsService flashGoodsService;

    //根据秒杀活动ID获取该活动的所有商品信息
    @RequestMapping("showFlashGoodsByFlashSaleId")
    @ResponseBody
    public Result<FlashGoodsMessagePo> showFlashGoodsByFlashSaleId(@RequestParam(value = "flashSaleId") Integer flashSaleId){
        List<FlashGoodsMessagePo> listpo = flashGoodsService.selectFlashSaleGoodsMessageBySaleId(flashSaleId);
       // System.out.println("进来了"+flashSaleId);
        if(listpo == null || listpo.size()<=0){
            return Result.error(CodeMsg.FLASH_GOODS_MESSAGE_NULL);
        }
      //  listpo.forEach(System.out::println);
        return Result.success(listpo);
    }

    //根据秒杀商品ID查询该秒杀商品的具体信息
    @RequestMapping("showFlashGoodsMessageByFlashGoodsId")
    @ResponseBody
    public Result<FlashGoodsMessagePo> showFlashGoodsMessageByFlashGoodsId(@RequestParam(value = "flashGoodsId") Integer flashGoodsId){

        return null;
    }


}
