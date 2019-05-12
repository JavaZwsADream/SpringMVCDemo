package com.aiit.controller;

import com.aiit.Pojo.Role;
import com.aiit.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
@RequestMapping("/Restful")
public class MyRoleRestFulController {
     @Autowired
     private RoleService roleService;

    @RequestMapping(value = "/getRole/{id}",method = RequestMethod.GET)
    public ModelAndView getview(@PathVariable("id") Integer id)
    {
        Role role = roleService.getRole(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("Role", role);
        mv.setView(new MappingJackson2JsonView());
        return mv;
    }
}
