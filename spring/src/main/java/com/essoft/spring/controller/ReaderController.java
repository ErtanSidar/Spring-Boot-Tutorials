package com.essoft.spring.controller;

import com.essoft.spring.entity.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    @Qualifier("pdfFileReader")
    private Reader reader;

    public String read() {
        return this.reader.readFile();
    }
}
