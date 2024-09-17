package com.example.Tienda.persistence.services;

import com.example.Tienda.persistence.entities.CategoriaEntity;
import com.example.Tienda.persistence.repositories.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<CategoriaEntity> findAll() {
        return (List<CategoriaEntity>) categoriaRepository.findAll();
    }

    public Optional<CategoriaEntity> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public CategoriaEntity save(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
