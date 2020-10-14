package com.api.springboot.model;

import java.util.ArrayList;
import java.util.Date;

public class Carrinho {
    private Long id;
    private String nome;
    private boolean terminado;
    private float precoTotal;
    //private Date data;
    private Compra compra;
    private ArrayList<Compra> compras;
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

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    //public Date getData() {return data;}

    //public void setData(Date data) { this.data = data; }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

}
