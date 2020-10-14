package com.api.springboot.model;

import java.util.Date;

public class Categoria {
    private Long id;
    private String nome;
    private Date criadoEm;

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

    public Date getCriadoEm() {
        return criadoEm;
    }



}
