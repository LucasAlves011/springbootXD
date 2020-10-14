package com.api.springboot.model;

import java.time.LocalDateTime;

public class Produto {
    private Long id;
    private String nome;
    private float preco;
    private float peso;
    private boolean tipo;
    private boolean ifPromocao;
    private Promocao promocao;
    private LocalDateTime criadoEm;

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

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

}
