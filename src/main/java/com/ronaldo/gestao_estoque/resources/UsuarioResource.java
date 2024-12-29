package com.ronaldo.gestao_estoque.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.gestao_estoque.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll() {
		Usuario u1 = new Usuario(1L, "SHIFT CONSULTORIA E SISTEMAS");
		return ResponseEntity.ok().body(u1);
	}

}
