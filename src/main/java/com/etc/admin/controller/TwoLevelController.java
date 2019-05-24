package com.etc.admin.controller;/*
 * 文件名：com.etc.admin.controller
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/24 10:56
 */

import com.etc.entity.OneLevel;
import com.etc.entity.TwoLevel;
import com.etc.service.OneLevelService;
import com.etc.service.TwoLevelService;
import com.etc.utils.CommonMessage;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin.action")
public class TwoLevelController {
    @Autowired
    private TwoLevelService twoLevelService;
    @RequestMapping("toTwoLevelList")
    @ResponseBody
    public PageData<TwoLevel>  level( Integer page, Integer limit, String content){
        if (content == null)
            content = "";
        PageData<TwoLevel> pd = twoLevelService.listTwoLevelByPage(page,limit,content);
        pd.setCode(0);
        pd.setMsg("ok");
        return pd;
    }
    @RequestMapping("editTwoLvelName")
    @ResponseBody
    public CommonMessage editOneLvelName(TwoLevel twoLevel){
        System.out.println(twoLevel);
        CommonMessage commonMessage=new CommonMessage();
        boolean flag=twoLevelService.updateByPrimaryKey(twoLevel);
        if(flag){
            commonMessage.setMsg("修改成功");
        }else{
            commonMessage.setMsg("修改失败");
        }
        return commonMessage;
    }
}
