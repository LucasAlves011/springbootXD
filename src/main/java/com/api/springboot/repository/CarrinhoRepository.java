package com.api.springboot.repository;

import com.api.springboot.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho,Long> {

    Carrinho findById(long id);
    void deleteById(long id);

}
