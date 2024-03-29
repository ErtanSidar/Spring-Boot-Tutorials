package com.essoft.spring.controller;

import com.essoft.spring.entity.FirstClass;
import com.essoft.spring.entity.SecondClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myController")
public class MyController {

    private FirstClass firstClass;
    private SecondClass secondClass;

    @Autowired
    public MyController(FirstClass firstClass, SecondClass secondClass) {
        this.firstClass = firstClass;
        this.secondClass = secondClass;
    }

    @GetMapping("/first-class")
    public String getNameOfFirstClass() {
        return firstClass.getName();
    }

    @GetMapping("/second-class")
    public String getNameOfSecondClass() {
        return secondClass.getName();
    }
}
