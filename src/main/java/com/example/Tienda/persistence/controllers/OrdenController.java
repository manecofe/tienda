package com.example.Tienda.persistence.controllers;

import com.example.Tienda.persistence.entities.OrdenEntity;
import com.example.Tienda.persistence.services.OrdenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ordenes")
@RequiredArgsConstructor
public class OrdenController {

    private final OrdenService ordenService;

    @GetMapping
    public List<OrdenEntity> getAllOrdenes() {
        return ordenService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdenEntity> getOrdenById(@PathVariable Long id) {
        Optional<OrdenEntity> orden = ordenService.findById(id);
        return orden.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public OrdenEntity createOrden(@RequestBody OrdenEntity orden) {
        return ordenService.save(orden);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdenEntity> updateOrden(@PathVariable Long id, @RequestBody OrdenEntity orden) {
        if (ordenService.findById(id).isPresent()) {
            orden.setId(id);
            return ResponseEntity.ok(ordenService.save(orden));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrden(@PathVariable Long id) {
        if (ordenService.findById(id).isPresent()) {
            ordenService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

