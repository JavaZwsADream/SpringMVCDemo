package com.aiit.controller;

import com.aiit.Pojo.Role;
import com.aiit.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
@RequestMapping("/Role")
public class MyController3 {
     @Autowired
     private RoleService roleService;

    @RequestMapping(value = "/getRole",method = RequestMethod.GET)
    public ModelAndView getview(@RequestParam("id") Integer id)
    {
       Role role= roleService.getRole(id);
      ModelAndView mv=new ModelAndView();
      mv.addObject("Role",role);
      mv.setView(new MappingJackson2JsonView());
      return mv;
    }
}
