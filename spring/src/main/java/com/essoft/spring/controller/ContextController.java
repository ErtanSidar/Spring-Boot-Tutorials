package com.essoft.spring.controller;

import com.essoft.spring.entity.ContextClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/context")
public class ContextController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/application-context")
    public void examples() {
        String[] beanDefNames=applicationContext.getBeanDefinitionNames();

        int count=applicationContext.getBeanDefinitionCount();

        ContextClass contextClass = (ContextClass) applicationContext.getBean("contextClass");

        ContextClass contextClass1 = (ContextClass) applicationContext.getBean(ContextClass.class);

        Class<?> contextClass2 = applicationContext.getType("contextClass");

        boolean contextClass3 = applicationContext.containsBean("contextClass");
    }
}
