package com.curso.springboot.seccion2.webapp.controller;

import com.curso.springboot.seccion2.webapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Julian", "Guzman");
        model.addAttribute("title", "Hola mundo Spring Boot!");
        model.addAttribute("user", user);
        return "details";
    }
}
