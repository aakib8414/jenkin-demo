package com.jen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Login {

    @GetMapping("/login")
    public String login() {
//        System.out.println("inside login page");
        return "login";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam("username") String username,
                         @RequestParam("password") String password) {
        System.out.println("inside login page");
        if ("admin".equals(username) && "admin".equals(password)) {
            return "success"; // Redirect to success page
        } else {
            return "redirect:/error"; // Redirect to error page
        }
//        return "login";
    }
}
