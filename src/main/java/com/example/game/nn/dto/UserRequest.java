package com.example.game.nn.dto;

import lombok.Data;
import java.util.List;

@Data
public class UserRequest {
    private List<Integer>userIdList;
    private String nicname;
    private String gender;
    private String country;
    private String city;
}
