package com.ronaldo.gestao_estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldo.gestao_estoque.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
