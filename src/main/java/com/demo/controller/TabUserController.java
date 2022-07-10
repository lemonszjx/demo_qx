package com.demo.controller;

import com.demo.common.CreateDate;
import com.demo.pojo.TabUser;
import com.demo.service.TabUserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
@Controller
@Log4j2


public class TabUserController {

    @Resource
    private TabUserService service;

@RequestMapping(value = "view")
    public  String view(HttpServletRequest request){
    service.findAll(request);
    return "TabUser/view";

}
@RequestMapping(value = "preAdd")
    public  String preAdd(){
    return "TabUser/add";
}
@RequestMapping(value = "add")
    public  String add(HttpServletRequest request,TabUser user){
    service.add(user,request);
    return "redirect:view";
}
@RequestMapping( value = "delete")
    public String delete(String id){
    service.delete(id);
return "redirect:view";
}

@RequestMapping(value = "preupdate")
    public String preupdate(HttpServletRequest request,String id){
      service.findbyid(id,request);

    return "TabUser/update";

}
@RequestMapping(value = "update")
    public String update(HttpServletRequest request,TabUser user){
    user.setCreatename("lemon");
    user.setCreatetime(CreateDate.getDate());
    service.update(user,request);


    return "redirect:view";

}
@RequestMapping(value = "updateopen")
    public String updateopen(String id){
    service.updateopen(id);
    return "redirect:view";
}
    @RequestMapping(value = "updateclose")
    public String updateclose(String id) {
        service.updateclose(id);
        return "redirect:view";
    }
}
