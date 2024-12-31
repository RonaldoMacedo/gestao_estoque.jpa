package com.ronaldo.gestao_estoque.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.gestao_estoque.entities.Produto;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {
	
	@GetMapping
	public ResponseEntity<Produto> findAll(){
		Produto p1 = new Produto(1L,"Luva de latex PP", "Luva para procedimento PP", "123P13", "789452478478", "s");
		return ResponseEntity.ok().body(p1);
	}

}
