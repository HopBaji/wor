package com.example.solarv2.controller;

import com.example.solarv2.Reposit.AdvertiRep;
import com.example.solarv2.Reposit.UserRepository;
import com.example.solarv2.model.Advertisement;
import com.example.solarv2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@Controller
public class loginController {
    @GetMapping("/start")
    public String net() {
        return "start";
    }


    @Autowired
    private AdvertiRep advertiRep;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String ViewAdvertisement(Model model) {
        Iterable<Advertisement> Advertisement = advertiRep.findAll();
        model.addAttribute("Advertisement", Advertisement);
        return "home";
    }

    // Обработка поиска по имени
    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        model.addAttribute("Advertisements", advertiRep.findByNameContainingIgnoreCase(name));
        model.addAttribute("advertisements", advertiRep.findByNameContainingIgnoreCase(name));
        return "index";
    }


    @GetMapping("/new/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Advertisement advertisement = advertiRep.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid advertisement ID: " + id));
        model.addAttribute("advertisement", advertisement);
        return "new";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("advertisement", new Advertisement());
        return "new";
    }

    @PostMapping("/save")
    public String saveAdvertisement(@ModelAttribute Advertisement advertisement) {
        advertiRep.save(advertisement);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteAdvertisement(@PathVariable("id") Long id) {
        advertiRep.deleteById(id);
        return "redirect:/";
    }


}



