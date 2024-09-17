package com.example.Tienda.persistence.controllers;


import com.example.Tienda.persistence.entities.UsuariosEntity;
import com.example.Tienda.persistence.services.UsuariosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuariosController {

    private final UsuariosService usuariosService;

    @GetMapping
    public List<UsuariosEntity> getAllUsuarios() {
        return usuariosService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuariosEntity> getUsuarioById(@PathVariable Long id) {
        Optional<UsuariosEntity> usuario = usuariosService.findById(id);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public UsuariosEntity createUsuario(@RequestBody UsuariosEntity usuario) {
        return usuariosService.save(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuariosEntity> updateUsuario(@PathVariable Long id, @RequestBody UsuariosEntity usuario) {
        if (usuariosService.findById(id).isPresent()) {
            usuario.setId(id);
            return ResponseEntity.ok(usuariosService.save(usuario));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        if (usuariosService.findById(id).isPresent()) {
            usuariosService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

