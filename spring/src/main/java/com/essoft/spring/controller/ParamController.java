package com.essoft.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/param")
public class ParamController {

    @GetMapping("/message")
    public String getMessage(@RequestParam String message) {
        return "Your message is :"+message;
    }
}
