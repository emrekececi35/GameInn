package com.example.game.nn.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserAuth {


  private long id;

  private String email;
  private String password;
  private String username;
  private java.sql.Timestamp passwordChangedAt;
  private String passwordResetToken;
  private String userIsActive;
  private String updateBy;
  private String createdBy;
  private java.sql.Timestamp updateOn;
  private java.sql.Timestamp createdOn;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public java.sql.Timestamp getPasswordChangedAt() {
    return passwordChangedAt;
  }

  public void setPasswordChangedAt(java.sql.Timestamp passwordChangedAt) {
    this.passwordChangedAt = passwordChangedAt;
  }


  public String getPasswordResetToken() {
    return passwordResetToken;
  }

  public void setPasswordResetToken(String passwordResetToken) {
    this.passwordResetToken = passwordResetToken;
  }


  public String getUserIsActive() {
    return userIsActive;
  }

  public void setUserIsActive(String userIsActive) {
    this.userIsActive = userIsActive;
  }


  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public java.sql.Timestamp getUpdateOn() {
    return updateOn;
  }

  public void setUpdateOn(java.sql.Timestamp updateOn) {
    this.updateOn = updateOn;
  }


  public java.sql.Timestamp getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(java.sql.Timestamp createdOn) {
    this.createdOn = createdOn;
  }

}
