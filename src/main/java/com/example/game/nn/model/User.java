package com.example.game.nn.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@ToString


public class User {

  @Column(nullable = false)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer user_id;
  private String nickname;
  private String gender;
  @Enumerated
  private Country country;
  @Enumerated
  private City city;
  private String updatedBy;
  private String createdBy;
  private java.sql.Timestamp updateOn;
  private java.sql.Timestamp createdon;
  private boolean is_deleted;



}
