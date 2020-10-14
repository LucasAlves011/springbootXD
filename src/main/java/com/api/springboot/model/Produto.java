package com.api.springboot.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Produto implements Serializable {

    private static final long serialVersonUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private float preco;
    private float peso;
    private boolean tipo;
    private boolean ifPromocao;


    private Promocao promocao;

    @CreatedDate
    private Date criadoEm = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isIfPromocao() {
        return ifPromocao;
    }

    public void setIfPromocao(boolean ifPromocao) {
        this.ifPromocao = ifPromocao;
    }

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    //    public Produto(String nome, float preco, float peso, boolean tipo,boolean ifPromocao, Promocao promocao) {
//        this.nome = nome;
//        this.preco = preco;
//        this.peso = peso;
//        this.tipo = tipo;
//        this.ifPromocao = ifPromocao;
//        this.promocao = promocao;
//        this.criadoEm = LocalDateTime.now();
//    }
//    public Produto(){this.criadoEm = LocalDateTime.now();}

}
