package com.example.game.nn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@ComponentScan("com.example.game.nn")
@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = "com.example.game.nn")
public class GameInnApplication {

    public static void main(String[] args) {

        SpringApplication.run(GameInnApplication.class, args);
    }

}
