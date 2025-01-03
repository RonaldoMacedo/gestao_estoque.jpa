package com.ronaldo.gestao_estoque.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ronaldo.gestao_estoque.entities.CentroDeCusto;
import com.ronaldo.gestao_estoque.entities.Fornecedor;
import com.ronaldo.gestao_estoque.entities.Produto;
import com.ronaldo.gestao_estoque.entities.Usuario;
import com.ronaldo.gestao_estoque.repositories.CentroDeCustoRepository;
import com.ronaldo.gestao_estoque.repositories.FornecedorRepository;
import com.ronaldo.gestao_estoque.repositories.ProdutoRepository;
import com.ronaldo.gestao_estoque.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	@Autowired
	private CentroDeCustoRepository centroDeCustoRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Ronaldo");
		Usuario u2 = new Usuario(null, "Paulo");
		Usuario u3 = new Usuario(null, "Renata");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		Fornecedor f1 = new Fornecedor(null, "JCA FOODS COM. DE PROD. ALIM. LTDA", "JCA", "04.334.118/0001-07", "n");
		Fornecedor f2 = new Fornecedor(null, "BIO-RAD LABORATORIOS BRASIL LTDA", "Bio-Rad", "03.188.198/0005-09", "s");
		Fornecedor f3 = new Fornecedor(null, "CONSALAB COML & IMP LTDA", "Consalab", "05.195.125/0001-38", "n");
		
		fornecedorRepository.saveAll(Arrays.asList(f1, f2, f3));
		
		CentroDeCusto c1 = new CentroDeCusto(null, "ADMINISTRATIVO");
		CentroDeCusto c2 = new CentroDeCusto(null, "UNIDADE PIRAPORA");
		CentroDeCusto c3 = new CentroDeCusto(null, "LUTZ");
		
		centroDeCustoRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Produto p1 = new Produto(null, null, "Luva de Látex PP (com Pó)", null, null, "s");
		Produto p2 = new Produto(null, null, "Luva de Látex P (com Pó)", null, null, "s");
		Produto p3 = new Produto(null, null, "Luva de Látex M (com Pó)", null, null, "s");
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
	}
	
	

}
