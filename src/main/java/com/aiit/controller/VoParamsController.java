package com.aiit.controller;

import com.aiit.Pojo.Role;
import com.aiit.VO.RoleParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VoParamsController {

    @RequestMapping("/voParam")
    public void getPage(@RequestParam("real_Name") String realName,String note)
    {
        System.out.println(realName);
        System.out.println(note);

    }
}
