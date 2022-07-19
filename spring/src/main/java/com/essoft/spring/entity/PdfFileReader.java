package com.essoft.spring.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PdfFileReader implements Reader{
    @Override
    public String readFile() {
        return "Pdf File Reader";
    }
}
