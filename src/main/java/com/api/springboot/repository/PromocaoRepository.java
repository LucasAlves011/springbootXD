package com.api.springboot.repository;

import com.api.springboot.model.Promocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocaoRepository extends JpaRepository<Promocao,Long> {

    Promocao findById(long id);
    void deleteById(long id);


}
