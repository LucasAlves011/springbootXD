package com.api.springboot.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Promocoes")
public class Promocao {

    private static final long serialVersonUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int aPartir;
    private float preco;
    private LocalDateTime criadoEm;

    public Promocao(){
        this.criadoEm = LocalDateTime.now();
    }

    public int getaPartir() {
        return aPartir;
    }

    public void setaPartir(int aPartir) {
        this.aPartir = aPartir;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
