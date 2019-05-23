package com.etc.user.controller;

import com.etc.entity.OneLevel;
import com.etc.entity.ProductDisplay;
import com.etc.entity.TwoLevel;
import com.etc.service.OneLevelService;
import com.etc.service.ProductDisplayService;
import com.etc.service.TwoLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user.action")
public class HomeController {
    @Autowired
    private OneLevelService oneLevelService;
    @Autowired
    private TwoLevelService twoLevelService;
    @Autowired
    private ProductDisplayService productDisplayService;

    /**
     *
     * @return 首页展示的一级二级控制器
     */
    @RequestMapping("home")
    public ModelAndView level(){
        ModelAndView mv=new ModelAndView("user/home");
        List<OneLevel> listOne=oneLevelService.listOneLevel();
        List<TwoLevel> listTwo=twoLevelService.listTwoLevel();
        mv.addObject("listOne",listOne);
        mv.addObject("listTwo",listTwo);
        return mv;
    }

    @RequestMapping("productDisplay")
    public ModelAndView productDisplay(Integer twolevelid){
        ModelAndView mv=new ModelAndView("user/search");
        List<ProductDisplay> listProductDisplay=productDisplayService.listProductDisplayById(twolevelid);
        String twolevelname=twoLevelService.getTwoLevelById(twolevelid).getTwolevelname();
        Integer total=productDisplayService.getTotal(twolevelid);
        mv.addObject("listProductDisplay",listProductDisplay);
        mv.addObject("twolevelname",twolevelname);
        mv.addObject("total",total);
        return mv;
    }
}
