package com.yy.msoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManegeCarController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
}
