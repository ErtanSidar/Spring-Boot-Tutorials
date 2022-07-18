package com.essoft.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/required")
public class RequiredController {

    @GetMapping({"/message","/message/{message}"})
    public String getMessage(@PathVariable(name="message",required = false) String message) {
        return  "Your message is :"+message;
    }

    @GetMapping("/message1")
    public String getMessage1(@RequestParam(name="message1",required = false,defaultValue = "default message") String message) {
        return "Your message is :"+message;
    }
}
