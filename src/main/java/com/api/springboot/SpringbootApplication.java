package com.api.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

       // Promocao x = new Promocao();

          //Se quiser rodar o java normal , so comentar o metodo SpringApplication... abaixo e rodar o main
          //normalemnte !

        SpringApplication.run(SpringbootApplication.class, args);
    }

}
