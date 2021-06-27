package com.example.game.nn.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "country")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
  private long country_id;
  private String countryName;
  @OneToMany
  @JoinColumn(name="country_id")
  private List<User> user = new ArrayList<>();




}
