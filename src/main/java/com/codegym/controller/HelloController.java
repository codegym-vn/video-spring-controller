package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String handle(Model model) {
        model.addAttribute("message", "Hello World!");
        return "/index";
    }

    //http://localhost:8080/cars/shop/info
    //http://localhost:8080/cart/show/info
    @RequestMapping("/car?/s?o?/info")
    public String info(Model model) {
        model.addAttribute("message", "Infor");
        return "/index";
    }

    //http://localhost:8080/cars/speed/info
    //http://localhost:8080/cabbie/signalized/info
    @RequestMapping("/c*/s*d/info")
    public ModelAndView info() {
        ModelAndView model = new ModelAndView("/index");
        model.addObject("message", "Infor");
        return model;
    }

    /*@RequestMapping("/card/**")
    public ModelAndView () {
        ModelAndView model = new ModelAndView("/index");
        model.addObject("message", "Infor");
        return model;
    }*/

}
