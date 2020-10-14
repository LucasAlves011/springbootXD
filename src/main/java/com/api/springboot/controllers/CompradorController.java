package com.api.springboot.controllers;

import com.api.springboot.model.Comprador;
import com.api.springboot.repository.CompradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api")
public class CompradorController {

        @Autowired
        CompradorRepository compradorRepository;

        @GetMapping("/compradores")
        public List<Comprador> listarComprador(){
            return compradorRepository.findAll();
        }

        @GetMapping("/comprador/{id}")
        public Comprador compradorById(@PathVariable(value = "id") long  id){ return compradorRepository.findById(id);}

        @PostMapping("/comprador")
        public Comprador salvarComprador(@RequestBody Comprador comprador){ return compradorRepository.save(comprador);
        }

        @DeleteMapping("/comprador")
        public void deletaComprador(@RequestBody Comprador comprador){
            compradorRepository.delete(comprador);
        }

        @DeleteMapping("/comprador/{id}")
        public void deletetById(@PathVariable(value = "id")long id){
            compradorRepository.deleteById(id);
        }

        @PutMapping("/comprador/put")
        public Comprador atualizarComprador(@RequestBody Comprador comprador){ return compradorRepository.save(comprador);
        }

}
