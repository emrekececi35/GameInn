package com.example.game.nn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseUserRequest {

    private String nickname;
    private String gender;
    private CountryDto country;
    private  CityDto city;
}
