package com.essoft.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class ExcelFileReader implements Reader{
    @Override
    public String readFile() {
        return "Excel File Reader";
    }
}
