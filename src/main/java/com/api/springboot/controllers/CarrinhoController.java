package com.api.springboot.controllers;

import com.api.springboot.model.Carrinho;
import com.api.springboot.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CarrinhoController {

    @Autowired
    CarrinhoRepository carrinhoRepository;

    @GetMapping("/carrinhos")
    public List<Carrinho> listarCompras(){
        return carrinhoRepository.findAll();
    }

    @GetMapping("/carrinho/{id}")
    public Carrinho carrinhoById(@PathVariable(value = "id") long  id){
        return carrinhoRepository.findById(id);
    }

    @PostMapping("/carrinho")
    public Carrinho salvarCarrinho(@RequestBody Carrinho carrinho){
        return carrinhoRepository.save(carrinho);
    }

    @DeleteMapping("/carrinho")
    public void deletaCarrinho(@RequestBody Carrinho carrinho){
        carrinhoRepository.delete(carrinho);
    }

    @DeleteMapping("/carrinho/{id}")
    public void deletetById(@PathVariable(value = "id")long id){
        carrinhoRepository.deleteById(id);
    }

    @PutMapping("/carrinho/put")
    public Carrinho atualizarCarrinho(@RequestBody Carrinho carrinho){
        return carrinhoRepository.save(carrinho);
    }


}
