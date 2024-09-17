package com.example.Tienda.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class EmpresaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @JsonManagedReference
    @OneToMany(mappedBy = "empresa")
    private List<ProductoEntity> productos;

    @JsonManagedReference
    @OneToMany(mappedBy = "empresa")
    private List<CategoriaEntity> categorias;
}

