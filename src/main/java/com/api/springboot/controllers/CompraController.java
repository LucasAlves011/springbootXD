package com.api.springboot.controllers;

import com.api.springboot.model.Compra;
import com.api.springboot.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CompraController  {

    @Autowired
    CompraRepository compraRepository;

    @GetMapping("/compras")
    public List<Compra> listarCompras(){
        return compraRepository.findAll();
    }

    @GetMapping("/compra/{id}")
    public Compra compraById(@PathVariable(value = "id") long  id){
        return compraRepository.findById(id);
    }

    @PostMapping("/compra")
    public Compra salvarCompra(@RequestBody Compra compra){
        return compraRepository.save(compra);
    }

    @DeleteMapping("/compra")
    public void deletaCompra(@RequestBody Compra compra){
        compraRepository.delete(compra);
    }

    @DeleteMapping("/compra/{id}")
    public void deletetById(@PathVariable(value = "id")long id){
        compraRepository.deleteById(id);
    }

    @PutMapping("/compra/put")
    public Compra atualizarCompra(@RequestBody Compra compra){
        return compraRepository.save(compra);
    }


}
