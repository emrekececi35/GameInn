package com.example.game.nn.dto;


import lombok.*;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Integer id;
    private String nickname;
    private String gender;
    private long country_id;

    private Date createdon;
    private Date updatedon;
    private boolean is_deleted;
}
