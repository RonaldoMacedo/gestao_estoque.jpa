package com.ronaldo.gestao_estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.gestao_estoque.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
