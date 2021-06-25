package com.example.game.nn.controller;


import com.example.game.nn.dto.CreateUserRequest;
import com.example.game.nn.dto.UpdateUserRequest;
import com.example.game.nn.dto.UserDto;
import com.example.game.nn.service.UserService;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<UserDto>>getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Integer id){//Farklı tanımları eşleştirme için@PathVariable(name="blabla")
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserDto>deleteUser(@PathVariable Integer id){

        return ResponseEntity.ok().build();//void de build
    }

    @PatchMapping("/{id}")
        public ResponseEntity<UserDto> updateUser(@PathVariable Integer id,
                                                  @RequestBody UpdateUserRequest userRequest){
        return ResponseEntity.ok(userService.updateUser(id,userRequest));
        }





/*
    @GetMapping("/Users")
    public List<User> getUser(){
        return  userService.getAllUsers();*/

}



