package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class UserController {

    @Autowired
    private UserService service;

}
