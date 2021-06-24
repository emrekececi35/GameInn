package com.example.game.nn.controller;


import com.example.game.nn.dto.CreateUserRequest;
import com.example.game.nn.dto.UserDto;
import com.example.game.nn.service.UserService;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1")
public class UserController {
     private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    public ResponseEntity<UserDto>createUser(@RequestBody CreateUserRequest userRequest){
        return ResponseEntity.ok(userService.createUser(userRequest));
    }



/*
    @GetMapping("/Users")
    public List<User> getUser(){
        return  userService.getAllUsers();*/

}



