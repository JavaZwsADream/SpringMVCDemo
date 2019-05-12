package com.aiit.controller;


import com.aiit.Pojo.Role;
import com.aiit.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
public class SessionAtrribute {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/sessionattribute")
    public ModelAndView getSession(@SessionAttribute Integer id)
    {
        ModelAndView mv=new ModelAndView();
        Role role = roleService.getRole(id);
        mv.addObject("role",role);
        mv.setView(new MappingJackson2JsonView());
        return mv;

    }
}
