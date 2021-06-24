package com.example.game.nn.controller;

import com.example.game.nn.dto.UserRequest;
import com.example.game.nn.service.UserService;
import com.example.game.nn.model.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GameInnController {

    private final UserService userService;

    public GameInnController(UserService userService){
        this.userService=userService;
    }



    @GetMapping("/Users")
    public List<User> getUser(){
        return  userService.getAllUsers();
    }



}
