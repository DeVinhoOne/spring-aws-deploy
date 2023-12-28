package com.example.springawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello :)\n" + LocalDateTime.now();
    }
}
