package com.curso.springboot.seccion2.webapp.controller;

import com.curso.springboot.seccion2.webapp.model.User;
import com.curso.springboot.seccion2.webapp.model.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class UserRestController {
    @GetMapping("/details")
    public UserDto details(){
        User user = new User("Julian", "Guzman");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring Boot!");
        return userDto;
    }
    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Julian", "Guzman");
        User user2 = new User("Pepe", "Guzman");
        User user3 = new User("John", "Doe");

        List<User> users = Arrays.asList(user, user2, user3);
//        List<User> users = new ArrayList<>();
//        users.add(user);
//        users.add(user2);
//        users.add(user3);
        return users;
    }
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Julian", "Guzman");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring Boot!");
        body.put("user", user);
        return body;
    }
}
