package com.procesos.tienda.controller;

import com.procesos.tienda.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("users/{id}")
    public User getUserById(@PathVariable /*(name = "id")*/ String id) {
        return new User();
    }




}
