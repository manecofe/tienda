package com.example.Tienda;

import com.example.Tienda.persistence.entities.PermissionEntity;
import com.example.Tienda.persistence.entities.RoleEntity;
import com.example.Tienda.persistence.entities.RoleEnum;
import com.example.Tienda.persistence.entities.UsuariosEntity;
import com.example.Tienda.persistence.repositories.PermissionRepository;
import com.example.Tienda.persistence.repositories.RoleRepository;
import com.example.Tienda.persistence.repositories.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class TiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}


}
