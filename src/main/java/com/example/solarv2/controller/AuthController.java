package com.example.solarv2.controller;


import com.example.solarv2.Reposit.UserRepository;
import com.example.solarv2.Request.UserRequest;
import com.example.solarv2.Service.UserService;
import com.example.solarv2.model.Advertisement;
import com.example.solarv2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login1";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

     @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        userService.registerUser(username, password);
        return "redirect:/login1";
    }

    @PostMapping("/logout")
    public String logout() {
        return "redirect:/login?logout";
    }
}
