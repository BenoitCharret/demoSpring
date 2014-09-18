package com.axioconsulting.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by benoit on 18/09/2014.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(required = false) String name){
        if (StringUtils.isEmpty(name)){
            return "Welcome anonymous";
        }
        return "Hello "+name;
    }
}
