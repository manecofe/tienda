package com.example.Tienda.persistence.services;

import com.example.Tienda.persistence.entities.EmpresaEntity;
import com.example.Tienda.persistence.repositories.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public List<EmpresaEntity> findAll() {
        return (List<EmpresaEntity>) empresaRepository.findAll();
    }

    public Optional<EmpresaEntity> findById(Long id) {
        return empresaRepository.findById(id);
    }

    public EmpresaEntity save(EmpresaEntity empresa) {
        return empresaRepository.save(empresa);
    }

    public void deleteById(Long id) {
        empresaRepository.deleteById(id);
    }
}

