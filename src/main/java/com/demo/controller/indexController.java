package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "top")
    public String top(){
        return "top";
    }
    @RequestMapping(value = "footer")
    public String footer(){
        return "footer";
    }
    @RequestMapping(value = "left")
    public String left(){
        return "left";
    }
    @RequestMapping(value = "right")
    public String right(){
        return "right";
    }

}
