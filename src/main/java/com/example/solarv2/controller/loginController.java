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
        return "home"; // Имя шаблона, например, home.html
    }
    @GetMapping("/login")
    public String login() {
        return "login1"; // Указывает на login1.html в templates
    }

}
