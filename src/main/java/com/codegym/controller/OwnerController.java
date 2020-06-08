package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class OwnerController {

    @GetMapping("/home")
    public String index(){

        return "/my-page";
    }
}
