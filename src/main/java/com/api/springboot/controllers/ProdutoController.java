package com.api.springboot.controllers;

import com.api.springboot.model.Produto;
import com.api.springboot.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class ProdutoController  {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    public Produto produtoById(@PathVariable(value = "id") long  id){
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    public Produto salvarProduto(@RequestBody Produto promocao){
        return produtoRepository.save(promocao);
    }

    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    @DeleteMapping("/produto/{id}")
    public void deletetById(@PathVariable(value = "id")long id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/produto")
    public Produto atualizarProduto(@RequestBody Produto promocao){
        return produtoRepository.save(promocao);
    }



}
