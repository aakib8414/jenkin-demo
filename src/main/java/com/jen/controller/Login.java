package com.jen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Login {

    @GetMapping("/login")
    public String login() {
//        System.out.println("inside login page");
        return "login";
    }
}
