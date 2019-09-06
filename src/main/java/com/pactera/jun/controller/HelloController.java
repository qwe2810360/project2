package com.pactera.jun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by codedrinker on 2019/9/3
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name")String name, Model model){
        System.out.println("=======1=======");
        model.addAttribute("name",name);
        System.out.println("=======2========"+name);
        return "hello";
    }
}
