package com.etc.admin.controller;/*
 * 文件名：com.etc.admin.controller
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/24 10:56
 */

import com.etc.entity.OneLevel;
import com.etc.service.OneLevelService;
import com.etc.utils.CommonMessage;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("admin.action")
public class OneLevelController {
    @Autowired
    private OneLevelService oneLevelService;
    @RequestMapping("toOneLevelList")
    @ResponseBody
    public PageData<OneLevel>  level(Integer page, Integer limit, String content){
        if (content == null)
            content = "";
        PageData<OneLevel> pd = oneLevelService.listOneLevelByPage(page,limit,content);
        pd.setCode(0);
        pd.setMsg("ok");
        return pd;
    }
    @RequestMapping("editOneLvelName")
    @ResponseBody
    public CommonMessage editOneLvelName(OneLevel oneLevel){
        System.out.println(oneLevel);
        CommonMessage commonMessage=new CommonMessage();
        boolean flag=oneLevelService.updateByPrimaryKey(oneLevel);
        if(flag){
            commonMessage.setMsg("修改成功");
        }else{
            commonMessage.setMsg("修改失败");
        }
        return commonMessage;
    }
}
