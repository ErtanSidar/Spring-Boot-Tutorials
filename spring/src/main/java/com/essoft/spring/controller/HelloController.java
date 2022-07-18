package com.essoft.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //localhost:8080/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
