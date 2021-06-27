package com.example.game.nn.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseUserRequest {

    private String nickname;
    private String gender;
    private String country;
}
