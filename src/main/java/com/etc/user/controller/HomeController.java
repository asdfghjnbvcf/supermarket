package com.etc.user.controller;

import com.etc.entity.OneLevel;
import com.etc.entity.TwoLevel;
import com.etc.service.OneLevelService;
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
    @RequestMapping("level")
    public ModelAndView level(){
        ModelAndView mv=new ModelAndView("user/home");
        List<OneLevel> listOne=oneLevelService.listOneLevel();
        List<TwoLevel> listTwo=twoLevelService.listTwoLevel();
        mv.addObject("listOne",listOne);
        mv.addObject("listTwo",listTwo);
        listOne.forEach(System.out::println);
        listTwo.forEach(System.out::println);
        return mv;
    }
}
