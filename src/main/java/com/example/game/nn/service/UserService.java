package com.example.game.nn.service;

import com.example.game.nn.dto.*;
import com.example.game.nn.model.Country;
import com.example.game.nn.model.User;

import com.example.game.nn.model.City;

import com.example.game.nn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;


import java.sql.Timestamp;

import java.util.*;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserDtoConvert userDtoConvert;
    public UserService(UserRepository userRepository, UserDtoConvert userDtoConvert) {
        this.userRepository = userRepository;
        this.userDtoConvert = userDtoConvert;
    }

    public UserDto createUser(CreateUserRequest userRequest) {
        User user = new User();
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        user.setUser_id((int) userRequest.getId());
        user.setNickname(userRequest.getNickname());
        user.setGender(userRequest.getGender());
        user.setCreatedon(userRequest.getCreatedon());

        userRepository.save(user);
        //User savedUser = userRepository.save(user);


        return userDtoConvert.convert(user);
    }

    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        for(User user : userList) {
            if(!user.is_deleted()) {
                userDtoList.add(userDtoConvert.convert(user));
            }
        }
            return userDtoList;
    }

    public UserDto getUserById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.map(userDtoConvert::convert).orElse(new UserDto());
    }

    public UserDto deleteUser(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        userOptional.ifPresent(user -> {

            user.set_deleted(true);
            userRepository.save(user);
        });
        return userOptional.map(userDtoConvert::convert).orElse(new UserDto());
    }

    public UserDto updateUser(Integer id, UpdateUserRequest userRequest) {

        Optional<User> userOptional = userRepository.findById(id);

        userOptional.ifPresent(user -> {

            user.setNickname(userRequest.getNickname());
            user.setGender(userRequest.getGender());
            userRepository.save(user);
        });
        return userOptional.map(userDtoConvert::convert).orElse(new UserDto());

    }
}
    /*private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

   public Optional<User>findUserById(Integer userId){
      return userRepository.findById(userId);
   }

   public List<User> getAllUsers(){
        return userRepository.findAll();
   }*/


