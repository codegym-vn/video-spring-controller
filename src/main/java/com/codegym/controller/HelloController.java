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

    //http://localhost:8080/cars/shop/info1
    //http://localhost:8080/cart/show/info1
    @RequestMapping("/car?/s?o?/info1")
    public String info1(Model model) {
        model.addAttribute("message", "Infor1");
        return "/index";
    }

    //http://localhost:8080/cars/speed/info2
    //http://localhost:8080/cabbie/signalized/info2
    @RequestMapping("/c*/s*d/info2")
    public ModelAndView info2() {
        ModelAndView model = new ModelAndView("/index");
        model.addObject("message", "Infor2");
        return model;
    }

    //http://localhost:8080/card
    //http://localhost:8080/card/about
    //http://localhost:8080/card/visa/registration
    @RequestMapping("/card/**")
    public ModelAndView info3() {
        ModelAndView model = new ModelAndView("/index");
        model.addObject("message", "Infor3");
        return model;
    }

}
