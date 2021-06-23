package com.example.game.nn.repository;


import com.example.game.nn.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {

}
