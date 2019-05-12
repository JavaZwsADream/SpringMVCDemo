package com.aiit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class redirectController {

    @RequestMapping("/sessionjsp")
    public String sessionjsp()
    {
        return "Session";
    }
}
