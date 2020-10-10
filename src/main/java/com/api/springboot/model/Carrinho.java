package com.api.springboot.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrinho {
    private Long id;
    private String nome;
    private boolean terminado;
    private float precoTotal;
    private LocalDate data;
    private Compra compra;
    private ArrayList<Compra> compras;
    private LocalDateTime criadoEm;

    public Carrinho(Long id, String nome, boolean terminado, float precoTotal, LocalDate data, Compra compra, ArrayList<Compra> compras) {
        this.id = id;
        this.nome = nome;
        this.terminado = terminado;
        this.precoTotal = precoTotal;
        this.data = data;
        this.compra = compra;
        this.compras = compras;
        this.criadoEm = LocalDateTime.now();
    }

    public Carrinho() {
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

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

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

}
