package com.essoft.spring.entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeClass {
    public PrototypeClass() {
        System.out.println("PrototypeClass created at "+ LocalDateTime.now());
    }
}
