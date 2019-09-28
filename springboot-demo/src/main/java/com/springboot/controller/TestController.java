package com.springboot.controller;

import com.springboot.demo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${hello.name}")
    String helloName;

    @Autowired
    private Demo demo;

    @RequestMapping("hello")
    public Object hello(){
        return helloName;
    }
}
