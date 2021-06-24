package com.example.game.nn.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long user_id;
  private String nickname;
  private String gender;
  private Country country;
  private City city;
  private String updatedBy;
  private String createdBy;
  private java.sql.Timestamp updateOn;
  private java.sql.Timestamp createdon;
  private boolean isDeleted;



}
