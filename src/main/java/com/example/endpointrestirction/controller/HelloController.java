package com.example.endpointrestirction.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping("/hey")
    public String hey(){
        return "POST -> Hey . Mate!";
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome!";
    }
    @GetMapping("/bye")
    public String bye(){
        return "Bye!";
    }

    @GetMapping("/hi")
    public String hi(){
        return "Hi!";
    }

}
