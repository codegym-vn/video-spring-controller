package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/")
    public String get(Model model){
        //mapped to hostname:port/home/
        model.addAttribute("message", "Home Page!");
        return "/home";
    }

    @RequestMapping("/index")
    public String index(Model model){
        //mapped to hostname:port/home/index/
        model.addAttribute("message", "Index Page!");
        return "/index";
    }

}
