package com.example.game.nn.Model;

import lombok.*;


import javax.persistence.*;

@Table
@Data
@Getter
@Setter
@Entity


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nickname;

}
