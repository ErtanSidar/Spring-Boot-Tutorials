package com.essoft.spring.entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonClass {
    public SingletonClass() {
        System.out.println("SingletonClass created at "+ LocalDateTime.now());
    }
}
