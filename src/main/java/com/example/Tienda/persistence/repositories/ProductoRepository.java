package com.example.Tienda.persistence.repositories;

import com.example.Tienda.persistence.entities.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Long> {
}
