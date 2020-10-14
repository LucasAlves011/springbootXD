package com.api.springboot.controllers;
import com.api.springboot.model.Categoria;
import com.api.springboot.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class CategoriaController {
    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping("/categorias")
    public List<Categoria> listarCategorias(){
        return categoriaRepository.findAll();
    }

    @GetMapping("/categoria/{id}")
    public Categoria categoriaById(@PathVariable(value = "id")long id){return
    categoriaRepository.findById(id);}

    @PostMapping("/categoria")
    public Categoria salvarCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/categoria")
    public void deletaCategoria(@RequestBody Categoria categoria){
        categoriaRepository.delete(categoria);
    }

    @DeleteMapping("/categoria/{id}")
    public void deletetById(@PathVariable(value = "id")long id){
        categoriaRepository.deleteById(id);
    }

    @PutMapping("/categoria")
    public Categoria atualizarCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }




}
