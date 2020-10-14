package com.api.springboot.model;

import org.apache.tomcat.jni.Local;

import java.util.Date;

public class Comprador {
    private Long id;
    private String nome;
    private boolean superComprador;
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

    public boolean isSuperComprador() {
        return superComprador;
    }

    public void setSuperComprador(boolean superComprador) {
        this.superComprador = superComprador;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

}
