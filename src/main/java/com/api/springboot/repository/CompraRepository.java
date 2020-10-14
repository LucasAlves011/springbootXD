package com.api.springboot.repository;

import com.api.springboot.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

    Compra findById(long id);
    void deleteById(long id);

}
