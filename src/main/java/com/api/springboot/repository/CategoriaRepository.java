package com.api.springboot.repository;
import com.api.springboot.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    Categoria findById(long id);
    void deleteById(long id);
}

