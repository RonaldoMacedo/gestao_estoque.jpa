package com.ronaldo.gestao_estoque.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ronaldo.gestao_estoque.entities.Usuario;
import com.ronaldo.gestao_estoque.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Ronaldo");
		Usuario u2 = new Usuario(null, "Paulo");
		Usuario u3 = new Usuario(null, "Renata");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}
	
	

}
