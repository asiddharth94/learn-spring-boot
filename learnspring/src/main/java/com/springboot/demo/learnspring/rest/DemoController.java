package com.springboot.demo.learnspring.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${project.default-mapping}")
    private String defalutMapping;
    @GetMapping("/")
    public String renderDefaultRoute() {
        return defalutMapping;
    }

    @GetMapping("/workout")
    public String workout () {
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String fortune() {
        return "Today's your lucky day!";
    }
}
