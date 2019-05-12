package com.aiit.controller.GetRoleController;
import com.aiit.Pojo.Role;
import com.aiit.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class getRoleByModelMap {

    @Autowired
    private RoleService roleService;
    @RequestMapping(value = "/getRoleByModelmap",method = RequestMethod.GET)
    public ModelAndView getRoleByMapModel(@RequestParam("id") Integer id, ModelMap modelMap)
    {
        Role role = roleService.getRole(id);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("RoleDetail");
        modelMap.addAttribute("role",role);
        return  mv;

    }

    @RequestMapping(value = "/getRoleByModel",method = RequestMethod.GET)
    public ModelAndView getRoleByModel(@RequestParam("id") Integer id, Model model)
    {
        Role role = roleService.getRole(id);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("RoleDetail");
        model.addAttribute("role",role);
        return  mv;
    }

    @RequestMapping(value = "/getRoleByMV",method = RequestMethod.GET)
    public ModelAndView getRoleByModel(@RequestParam("id") Integer id, ModelAndView mv)
    {
        Role role = roleService.getRole(id);
        mv.setViewName("RoleDetail");
        mv.addObject("role",role);
        return  mv;
    }

}
