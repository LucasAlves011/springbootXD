package com.api.springboot.model;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Promocoes")
public class Promocao implements Serializable {

    private static final long serialVersonUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int aPartir;
    private float preco;

    @CreatedDate
    private Date criadoEm = new Date() ;

    public long getId() {
        return id;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
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
