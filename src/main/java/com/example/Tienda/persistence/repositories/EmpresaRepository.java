package com.example.Tienda.persistence.repositories;

import com.example.Tienda.persistence.entities.EmpresaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaEntity, Long> {
}
