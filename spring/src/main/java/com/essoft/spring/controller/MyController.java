package com.essoft.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myController")
public class MyController {

    @GetMapping("/message/{message}")
    public String getMessage(@PathVariable String message) {
        return  "Your message is :"+message;
    }

    /*@GetMapping("/message/{m}")
    public String getMessage(@PathVariable("m") String message) {
        return  "your message is :"+message;
    }*/
}
