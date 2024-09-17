package com.example.Tienda.persistence.services;

import com.example.Tienda.persistence.entities.ProductoEntity;
import com.example.Tienda.persistence.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<ProductoEntity> findAll() {
        return (List<ProductoEntity>) productoRepository.findAll();
    }

    public Optional<ProductoEntity> findById(Long id) {
        return productoRepository.findById(id);
    }

    public ProductoEntity save(ProductoEntity producto) {
        return productoRepository.save(producto);
    }

    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
}

