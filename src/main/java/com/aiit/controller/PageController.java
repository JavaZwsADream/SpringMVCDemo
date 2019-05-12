package com.aiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @RequestMapping("/form")
    public ModelAndView getPage()
    {
       ModelAndView mv=new ModelAndView();
       mv.setViewName("param");
       return mv;
    }
}
