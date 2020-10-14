package com.api.springboot.model;

import org.apache.tomcat.jni.Local;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "comprador")
public class Comprador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private boolean superComprador;

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

    public boolean isSuperComprador() {
        return superComprador;
    }

    public void setSuperComprador(boolean superComprador) {
        this.superComprador = superComprador;
    }

    public Date getCriadoEm() { return criadoEm; }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }
}
