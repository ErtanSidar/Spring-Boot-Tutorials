package com.essoft.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    // GET  : we use to display data
    // POST : we use to save data
    // PUT  : we use to update data
    //PATCH : we use it to update certain sections
    //DELETE : we use to delete data

    //localhost:8080/api/hello
    @GetMapping("/hello")
    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World";
    }

    @PostMapping("/save")
    public String save() {
        return "Data saved!";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "Data deleted!";
    }
}
