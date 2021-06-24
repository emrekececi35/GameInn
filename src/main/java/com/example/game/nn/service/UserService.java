package com.example.game.nn.service;

import com.example.game.nn.model.Country;
import com.example.game.nn.dto.CountryDto;
import com.example.game.nn.dto.CreateUserRequest;
import com.example.game.nn.dto.UserDto;
import com.example.game.nn.model.User;

import com.example.game.nn.model.City;
import com.example.game.nn.dto.CityDto;

import com.example.game.nn.repository.UserRepository;
import  org.springframework.stereotype.Service;



import java.util.*;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto createUser(CreateUserRequest userRequest) {
        User user = new User();
        user.setUser_id(userRequest.getId());
        user.setNickname(userRequest.getNickname());
        user.setGender(userRequest.getGender());
        user.setCountry(Country.valueOf(userRequest.getCountry().name()));
        user.setCity(City.valueOf(userRequest.getCity().name()));
        userRepository.save(user);
        //User savedUser = userRepository.save(user);

        UserDto userDto= new UserDto();
        userDto.setId(user.getUser_id());
        userDto.setNickname(user.getNickname());
        userDto.setGender(user.getGender());
        userDto.setCountry(CountryDto.valueOf(user.getCountry().name()));
        userDto.setCity(CityDto.valueOf(user.getCity().name()));
        return userDto;
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


