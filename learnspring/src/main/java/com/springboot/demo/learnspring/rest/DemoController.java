package com.springboot.demo.learnspring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String renderDefaultRoute() {
        return "Learning Spring";
    }
}
