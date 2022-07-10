package com.demo.controller;

import com.demo.common.CreateDate;
import com.demo.common.CreateUUId;
import com.demo.pojo.TabRole;
import com.demo.service.TabRoleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
public class TabRoleController {
    @Resource
    private TabRoleService service;
    @RequestMapping(value = "rview")
    public String rview(HttpServletRequest request){
   service.findall(request);
   return "TabRole/view";
    }
    @RequestMapping(value = "rpreadd")
    public String rpreadd(){

        return "TabRole/add";
    }
    @RequestMapping(value = "radd")
    public  String radd(HttpServletRequest request, TabRole role){

service.add(role,request);
    return "redirect:rview";
    }
    @RequestMapping(value = "rdelete")
    public String rdelete(String id){
        service.delete(id);
        return "redirect:rview";
    }
    @RequestMapping(value = "rpreupdate")
    public String rpreupdate(HttpServletRequest request,String id){
        service.findbyid(id,request);
        return "TabRole/update";
    }
    @RequestMapping(value = "rupdate")
    public String rupdate(HttpServletRequest request,TabRole role){
        service.update(role,request);
        return "redirect:rview";
    }
    @RequestMapping(value="table_role_check_view")
    public String table_role_check_view(String userid,HttpServletRequest request){
        service.select_check_role_view(userid,request);
        return "sys_users_role/view";
    }
}
