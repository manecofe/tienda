package com.example.Tienda.persistence.repositories;

import com.example.Tienda.persistence.entities.UsuariosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuariosEntity, Long> {
    Optional<UsuariosEntity> findUserEntityByUsername(String username);
}
