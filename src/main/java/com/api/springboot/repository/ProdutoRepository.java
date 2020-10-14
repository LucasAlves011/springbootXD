package com.api.springboot.repository;

import com.api.springboot.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    Produto findById(long id);
    void deleteById(long id);


}
