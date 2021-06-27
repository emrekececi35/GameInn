package com.example.game.nn.dto;

import com.example.game.nn.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConvert {

   public  UserDto convert(User user){
        return UserDto.builder()
                .id(user.getUser_id())
                .nickname(user.getNickname())
                .gender(user.getGender())
                .country(user.getCountry())
                .build();

        /*UserDto userDto = new UserDto();
        userDto.setId(user.getUser_id());
        userDto.setNickname(user.getNickname());
        userDto.setGender(user.getGender());
        userDto.setCountry(CountryDto.valueOf(user.getCountry().name()));
        userDto.setCity(CityDto.valueOf(user.getCity().name()));
        return userDto;*/
    }

}
