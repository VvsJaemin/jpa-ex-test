package com.fa.jpa.bookmanager.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";
    }
}
