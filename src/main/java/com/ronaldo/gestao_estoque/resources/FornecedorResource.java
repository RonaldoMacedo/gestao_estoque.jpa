package com.ronaldo.gestao_estoque.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.gestao_estoque.entities.Fornecedor;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResource {
	
	@GetMapping
	public ResponseEntity<Fornecedor> findAll(){
		Fornecedor f1 = new Fornecedor(1L, "JCA FOODS COM. DE PROD. ALIM. LTDA", "JCA", "04.334.118/0001-07", "n");
		return ResponseEntity.ok().body(f1);
	}

}
