package com.example.game.nn.model;


import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "user", schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString


public class User {

  @Column(nullable = false)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer user_id;
  private String nickname;
  private String gender;

  @LastModifiedBy
  @Column(name="updated_by")
  private String updatedBy;

  @CreatedBy
  @Column(name="created_by")
  private String createdBy;

  @LastModifiedDate
  @Column(name ="update_on")
  private java.sql.Timestamp updateOn;

  @CreatedDate
  @Column(name="createdon")
  private java.sql.Timestamp createdon;

  private boolean is_deleted;



}
