package com.ronaldo.gestao_estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.gestao_estoque.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{

}
