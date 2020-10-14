package com.api.springboot.model;
import java.time.*;
import java.util.Date;


public class Compra {
    private long id;
    private Produto produto;
    private int quantidade;
    private float precoTotal;
    private Date criadoEm;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

}
