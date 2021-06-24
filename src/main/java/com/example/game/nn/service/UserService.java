package com.example.game.nn.service;

import com.example.game.nn.model.User;
import  com.example.game.nn.repository.UserRepository;
import  org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

   public Optional<User>findUserById(Integer userId){
      return userRepository.findById(userId);
   }

   public List<User> getAllUsers(){
        return userRepository.findAll();
   }

}
