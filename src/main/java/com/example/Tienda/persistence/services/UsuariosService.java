package com.example.Tienda.persistence.services;

import com.example.Tienda.persistence.entities.UsuariosEntity;
import com.example.Tienda.persistence.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuariosService {

    private final UsuarioRepository usuariosRepository;

    public List<UsuariosEntity> findAll() {
        return (List<UsuariosEntity>) usuariosRepository.findAll();
    }

    public Optional<UsuariosEntity> findById(Long id) {
        return usuariosRepository.findById(id);
    }

    public UsuariosEntity save(UsuariosEntity usuario) {
        return usuariosRepository.save(usuario);
    }

    public void deleteById(Long id) {
        usuariosRepository.deleteById(id);
    }
}

