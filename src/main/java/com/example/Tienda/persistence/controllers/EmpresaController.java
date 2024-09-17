package com.example.Tienda.persistence.controllers;

import com.example.Tienda.persistence.entities.EmpresaEntity;
import com.example.Tienda.persistence.services.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresas")
@RequiredArgsConstructor
public class EmpresaController {

    private final EmpresaService empresaService;

    @GetMapping
    public List<EmpresaEntity> getAllEmpresas() {
        return empresaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpresaEntity> getEmpresaById(@PathVariable Long id) {
        Optional<EmpresaEntity> empresa = empresaService.findById(id);
        return empresa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public EmpresaEntity createEmpresa(@RequestBody EmpresaEntity empresa) {
        return empresaService.save(empresa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpresaEntity> updateEmpresa(@PathVariable Long id, @RequestBody EmpresaEntity empresa) {
        if (empresaService.findById(id).isPresent()) {
            empresa.setId(id);
            return ResponseEntity.ok(empresaService.save(empresa));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpresa(@PathVariable Long id) {
        if (empresaService.findById(id).isPresent()) {
            empresaService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

