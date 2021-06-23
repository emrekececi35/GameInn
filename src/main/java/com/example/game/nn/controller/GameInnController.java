package com.example.game.nn.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/v1")
public class GameInnController {

    @GetMapping
    public ResponseEntity <String> hello(){
        return ResponseEntity.ok("hello");
    }

}
