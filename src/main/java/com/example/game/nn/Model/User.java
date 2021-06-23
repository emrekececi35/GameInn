package com.example.game.nn.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Table
@Data
@Getter
@Setter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private String nickname;

}
