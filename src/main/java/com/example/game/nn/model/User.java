package com.example.game.nn.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "user", schema = "public")
@Data
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

  private String country;

  @LastModifiedBy
  @Column(name="updated_by")
  private String updatedBy;

  @CreatedBy
  @Column(name="created_by")
  private String createdBy;

  @LastModifiedBy
  @Column(name ="update_on")
  private Date updateOn;

  @CreationTimestamp
  @Column(name="createdon")
  private Date createdon;

  private boolean is_deleted;


  @PrePersist
   protected void prePersist(){
    if (this.createdon == null) createdon = new Date();
    if(this.updateOn == null) updateOn = new Date();
  }
  @PreUpdate
  protected void preUpdate(){
    this.updateOn = new Date();
  }


}
