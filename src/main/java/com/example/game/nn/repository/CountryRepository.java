package com.example.game.nn.repository;


import com.example.game.nn.model.Country;
import com.example.game.nn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CountryRepository  extends JpaRepository <Country,Long>{
}
