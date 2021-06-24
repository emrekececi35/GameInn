package com.example.game.nn.model;


import javax.persistence.*;

@Entity
@Table(name = "user",schema = "public")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long userId;
  private String nickname;
  private String gender;
  private String country;
  private String city;
  private String updatedBy;
  private String createdBy;
  private java.sql.Timestamp updateOn;
  private java.sql.Timestamp createdon;
  private boolean isDeleted;

  public User(){

  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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


  public java.sql.Timestamp getCreatedon() {
    return createdon;
  }

  public void setCreatedon(java.sql.Timestamp createdon) {
    this.createdon = createdon;
  }


  public boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

}
