package com.example.Tienda.persistence.services;

import com.example.Tienda.persistence.entities.OrdenEntity;
import com.example.Tienda.persistence.repositories.OrdenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrdenService {

    private final OrdenRepository ordenRepository;

    public List<OrdenEntity> findAll() {
        return (List<OrdenEntity>) ordenRepository.findAll();
    }

    public Optional<OrdenEntity> findById(Long id) {
        return ordenRepository.findById(id);
    }

    public OrdenEntity save(OrdenEntity orden) {
        return ordenRepository.save(orden);
    }

    public void deleteById(Long id) {
        ordenRepository.deleteById(id);
    }
}

