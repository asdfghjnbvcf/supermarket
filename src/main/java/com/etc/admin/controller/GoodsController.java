package com.etc.admin.controller;/*
 * 文件名：com.etc.admin.controller
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/24 10:56
 */

import com.etc.entity.Goods;
import com.etc.entity.TwoLevel;
import com.etc.service.GoodsService;
import com.etc.service.TwoLevelService;
import com.etc.utils.CommonMessage;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin.action")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     *
     * @param page 第几页
     * @param limit 一页显示多少条
     * @param content 模糊查询的内容
     * @return 返回分页的对象
     */
    @RequestMapping("toGoodsList")
    @ResponseBody
    public PageData<Goods>  level( Integer page, Integer limit, String content){
        if (content == null)
            content = "";
        PageData<Goods> pd = goodsService.listGoodsByPage(page,limit,content);
        pd.setCode(0);
        pd.setMsg("ok");
        return pd;
    }
    @RequestMapping("editGoodsName")
    @ResponseBody
    public CommonMessage editOneLvelName(TwoLevel twoLevel){
        CommonMessage commonMessage=new CommonMessage();
       /* boolean flag=twoLevelService.updateByPrimaryKey(twoLevel);
        if(flag){
            commonMessage.setMsg("修改成功");
        }else{
            commonMessage.setMsg("修改失败");
        }*/
        return commonMessage;
    }
}
