package com.own.mavenproject.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/maven")
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello there!!";
    }
    
}
