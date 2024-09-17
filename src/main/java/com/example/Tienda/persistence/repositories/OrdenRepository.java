package com.example.Tienda.persistence.repositories;

import com.example.Tienda.persistence.entities.OrdenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenRepository extends CrudRepository<OrdenEntity, Long> {
}
