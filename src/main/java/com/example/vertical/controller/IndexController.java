package com.example.vertical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    private String index(){
        return "vertical";
    }
    @GetMapping("/company")
    private String company(){
        return "company";
    }
    @GetMapping("/login")
    private String login(){
        return "login";
    }
    @GetMapping("/register")
    private String register(){
        return "register";
    }
    @GetMapping("/write")
    private String write(){
        return "write";
    }
}
