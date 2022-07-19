package com.essoft.spring.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyClass {
    public LazyClass() {
        System.out.println("LazyClass bean initialized");
    }
}
