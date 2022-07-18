package com.essoft.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    //localhost:8080/api/hello
    //@GetMapping("/hello")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World";
    }
}
