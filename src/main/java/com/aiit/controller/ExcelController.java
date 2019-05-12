package com.aiit.controller;

import com.aiit.Pojo.ExcelView;
import com.aiit.Pojo.Role;
import com.aiit.Service.ExcelExportService;
import com.aiit.Service.RoleService;
import com.aiit.VO.PageParam;
import com.aiit.VO.RoleParam;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class ExcelController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/export",method = RequestMethod.GET)
    public ModelAndView export()
    {

        //模型和视图
        ModelAndView mv=new ModelAndView();
        ExcelView ev=new ExcelView(excelExportService());
        ev.setFileName("角色名称.xlsx");
       //设置sql后台参数
        RoleParam roleParam=new RoleParam();
        //限制一万条
        PageParam pageParam=new PageParam();
        pageParam.setStart(0);
        pageParam.setLimit(10000);
        roleParam.setPageParam(pageParam);
        //查询
        List<Role> roleList=roleService.getRoleByPage(roleParam);
        mv.addObject("roleList",roleList);
        mv.setView(ev);
        return mv;
    }
    @SuppressWarnings({"unchecked"})
    private ExcelExportService excelExportService()
    {
        //使用lmada表达式自定义导出Excel规则
        return (Map<String,Object> model, Workbook work)->{
            //获取用户列表
         List<Role> roleList= (List<Role>) model.get("roleList");
         //生成sheet
            Sheet sheet=work.createSheet("所有角色");
            //加载标题
            Row title=sheet.createRow(0);
            title.createCell(0).setCellValue("编号");
            title.createCell(1).setCellValue("名称");
            title.createCell(2).setCellValue("备注");
            //遍历角色数据 生成一行行数据
            for (int i=0;i<roleList.size();i++)
            {
                Role role=roleList.get(i);
                int rowIndex=i+1;
                Row row=sheet.createRow(rowIndex);
                row.createCell(0).setCellValue(role.getId());
                row.createCell(1).setCellValue(role.getRealName());
                row.createCell(2).setCellValue(role.getNote());
            }
        };

    }
}
