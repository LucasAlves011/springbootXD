package com.api.springboot;

import com.api.springboot.controllers.ProdutoController;
import com.api.springboot.model.Produto;
import com.api.springboot.model.Promocao;
import com.api.springboot.repository.ProdutoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

       // Promocao x = new Promocao();

          //Se quiser rodar o java normal , so comentar o metodo SpringApplication... abaixo e rodar o main
          //normalemnte !
    /*
        Promocao x = new Promocao();
        x.setaPartir(3);
        x.setPreco(13);

        Produto k = new Produto();
        k.setIfPromocao(true);
        k.setNome("Coca Cola");
        k.setPeso(0);
        k.setTipo(false);
        k.setPromocao(x);

        ProdutoController p1 = new ProdutoController();
         k = p1.
    */

        SpringApplication.run(SpringbootApplication.class, args);
    }

}
