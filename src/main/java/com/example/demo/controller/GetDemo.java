package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class GetDemo {

    @GetMapping("/test")
    @ResponseBody
    public String getTesting(){
        return "Hii this testing ";
    }
    @GetMapping("/")
    @ResponseBody
    public String test(){
        return "this is a springboot application";
    }
}
