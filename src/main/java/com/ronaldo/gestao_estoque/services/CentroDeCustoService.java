package com.ronaldo.gestao_estoque.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronaldo.gestao_estoque.entities.CentroDeCusto;
import com.ronaldo.gestao_estoque.repositories.CentroDeCustoRepository;

@Service
public class CentroDeCustoService {
	
	@Autowired
	private CentroDeCustoRepository repository;
	
	public List<CentroDeCusto> findAll(){
		return repository.findAll();
	}
	
	public CentroDeCusto findById(Long id) {
		Optional<CentroDeCusto> obj = repository.findById(id);
		return obj.get();
	}

}
