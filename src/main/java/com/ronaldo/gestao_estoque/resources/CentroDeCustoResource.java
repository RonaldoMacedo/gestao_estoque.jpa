package com.ronaldo.gestao_estoque.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.gestao_estoque.entities.CentroDeCusto;

@RestController
@RequestMapping(value = "/centrosdecusto")
public class CentroDeCustoResource {
	
	@GetMapping
	public ResponseEntity<CentroDeCusto> findAll(){
		CentroDeCusto c1 = new CentroDeCusto(1L, "ADMINISTRATIVO");
		return ResponseEntity.ok().body(c1);
	}

}
