package com.api.springboot.repository;

import com.api.springboot.model.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompradorRepository extends JpaRepository<Comprador,Long> {

    Comprador findById(long id);
    void deleteById(long id);
}
