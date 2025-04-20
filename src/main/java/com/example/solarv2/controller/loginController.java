package com.example.solarv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class loginController {
    @GetMapping("/start")
    public String net(){
        return "start";
    }
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/login")
    public String login() {
        return "login1";
    }

}
