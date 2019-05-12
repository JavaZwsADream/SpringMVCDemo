package com.aiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MyController2  {
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView getview(@SessionAttribute("userName") String userName)
    {
        System.out.println(userName);
      ModelAndView nv=new ModelAndView();
      nv.setViewName("index");
      return nv;
    }
}
