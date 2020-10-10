package com.api.springboot.model;

import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

public class Comprador {
    private Long id;
    private String nome;
    private boolean superComprador;
    private LocalDateTime criadoEm;

    public Comprador(String nome, boolean superComprador) {
        this.nome = nome;
        this.superComprador = superComprador;
        this.criadoEm = LocalDateTime.now();
    }

    public Comprador() {

        this.criadoEm = LocalDateTime.now();
    }

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

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

}
