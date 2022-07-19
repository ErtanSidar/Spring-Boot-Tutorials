package com.essoft.spring.controller;

import com.essoft.spring.entity.Example1;
import com.essoft.spring.entity.LazyClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LazyController {
    private LazyClass lazyClass;
    private Example1 example1;

    public LazyController(LazyClass lazyClass, Example1 example1) {
        this.lazyClass = lazyClass;
        this.example1 = example1;
    }

    public LazyController(LazyClass lazyClass) {
        this.lazyClass = lazyClass;
    }
}
