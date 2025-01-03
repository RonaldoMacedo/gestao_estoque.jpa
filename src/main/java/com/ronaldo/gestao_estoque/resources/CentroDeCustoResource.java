package com.ronaldo.gestao_estoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.gestao_estoque.entities.CentroDeCusto;
import com.ronaldo.gestao_estoque.entities.Fornecedor;
import com.ronaldo.gestao_estoque.services.CentroDeCustoService;

@RestController
@RequestMapping(value = "/centrosdecusto")
public class CentroDeCustoResource {
	
	@Autowired
	private CentroDeCustoService service;
	
	@GetMapping
	public ResponseEntity<List<CentroDeCusto>> findAll() {
		List<CentroDeCusto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CentroDeCusto> findById(@PathVariable Long id){
		CentroDeCusto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
