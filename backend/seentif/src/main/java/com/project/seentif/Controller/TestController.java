package com.project.seentif.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "Hello from Spring Boot";
    }
}
