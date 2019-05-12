package com.aiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ParamsController  {
    //todo
    @RequestMapping("/params")
    public void getParam(String realName,String note)
    {
        System.out.println(realName);
        System.out.println(note);
    }


}
