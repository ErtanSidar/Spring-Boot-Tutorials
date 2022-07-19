package com.essoft.spring.controller;

import com.essoft.spring.entity.PrototypeClass;
import com.essoft.spring.entity.SingletonClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
    @Autowired
    private SingletonClass singletonClass;

    @Autowired
    private PrototypeClass prototypeClass;
}
