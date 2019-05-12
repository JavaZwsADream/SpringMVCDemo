package com.aiit.controller;

import com.aiit.Pojo.Role;
import com.aiit.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/sessionController")
@SessionAttributes(names = {"id"},types = Role.class)
public class SessionsController  {

    @Autowired
    private RoleService roleService;
    @RequestMapping("/attribute")
    public ModelAndView sessionAttribute(Integer id)
    {
        ModelAndView mv=new ModelAndView();
        Role role = roleService.getRole(1);
        mv.addObject("role",role);
        mv.addObject("id",id);
        mv.setViewName("sessionAttribute");
        return mv;

    }

}
