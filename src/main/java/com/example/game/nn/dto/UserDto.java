package com.example.game.nn.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Integer id;
    private String nickname;
    private String gender;
    private CountryDto country;
    private  CityDto city;
    private java.sql.Timestamp createdon;
    private java.sql.Timestamp updatedon;
    private boolean is_deleted;
}
