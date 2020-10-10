package com.api.springboot.model;
import java.time.*;


public class Comprador {
    private long id;
    private Produto produto;
    private int quantidade;
    private float precoTotal;
    private LocalDateTime criadoEm;

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

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public Comprador(Produto produto, int quantidade, float precoTotal) {

        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
        this.criadoEm = LocalDateTime.now();
    }

    public Comprador() {
        this.criadoEm = LocalDateTime.now();
    }

}
