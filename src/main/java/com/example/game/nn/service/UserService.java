package com.example.game.nn.service;

import  com.example.game.nn.repository.UserRepository;
import  org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

        public Optional<User> findUserById(Integer Integer id){
        return userRepository.findById(userId);
        }


}
