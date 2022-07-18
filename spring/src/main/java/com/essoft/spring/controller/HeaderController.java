package com.essoft.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/header")
public class HeaderController {

    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader) {
        return "your header is :"+myHeader;
    }
}
