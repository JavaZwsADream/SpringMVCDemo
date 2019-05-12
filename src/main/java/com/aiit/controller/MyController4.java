package com.aiit.controller;

import com.aiit.Pojo.Role;
import com.aiit.Service.RoleService;
import com.aiit.VO.RoleParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
@RequestMapping("/Role")
public class MyController4 {
//     @Autowired
//     private RoleService roleService;

    @RequestMapping(value = "/getRolewithPage",method = RequestMethod.POST)
    public ModelAndView getview(@RequestBody RoleParam roleParam)
    {
        ModelAndView mv=new ModelAndView();
        mv.addObject("roleParam",roleParam);
        mv.setView(new MappingJackson2JsonView());
        return  mv;
    }
}
