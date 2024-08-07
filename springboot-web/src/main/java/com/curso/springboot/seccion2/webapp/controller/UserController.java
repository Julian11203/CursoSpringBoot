package com.curso.springboot.seccion2.webapp.controller;

import com.curso.springboot.seccion2.webapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Julian", "Guzman");
        user.setEmail("julian@correo.com");
        model.addAttribute("title", "Hola mundo Spring Boot!");
        model.addAttribute("user", user);
        return "details";
    }
    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
                new User("Pepa", "Gonzales"),
                new User("Lalo", "Perez", "lalo@correo.com"),
                new User("Juanita", "Ro", "juana@correo.com"),
                new User("Andres", "Doe"));

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");
        return "list";
    }
}
