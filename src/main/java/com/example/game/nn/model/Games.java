package com.example.game.nn.model;


public class Games {

  private long gameCode;
  private long gameType;
  private String gameName;
  private String createdBy;
  private String updateBy;
  private java.sql.Timestamp createdOn;
  private java.sql.Timestamp updateOn;
  private String isDeleted;


  public long getGameCode() {
    return gameCode;
  }

  public void setGameCode(long gameCode) {
    this.gameCode = gameCode;
  }


  public long getGameType() {
    return gameType;
  }

  public void setGameType(long gameType) {
    this.gameType = gameType;
  }


  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }


  public java.sql.Timestamp getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(java.sql.Timestamp createdOn) {
    this.createdOn = createdOn;
  }


  public java.sql.Timestamp getUpdateOn() {
    return updateOn;
  }

  public void setUpdateOn(java.sql.Timestamp updateOn) {
    this.updateOn = updateOn;
  }


  public String getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(String isDeleted) {
    this.isDeleted = isDeleted;
  }

}
