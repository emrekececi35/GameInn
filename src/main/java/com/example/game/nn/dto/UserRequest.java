package com.example.game.nn.dto;

import lombok.Data;
import java.util.List;

@Data
public class UserRequest {
    private Integer user_id;;
    private String nickname;
    private String gender;
    private java.sql.Timestamp createdon;
    private java.sql.Timestamp updatedon;

}
