package com.example.vertical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.AttributeOverride;

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
    @GetMapping("/user/{id}")
    private void FindUserById(@PathVariable("id") String id){

    }
}
