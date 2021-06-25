package com.example.game.nn.dto;


import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Integer id;
    private String nickname;
    private String gender;
    private CountryDto country;
    private  CityDto city;
    private boolean is_deleted;
}
