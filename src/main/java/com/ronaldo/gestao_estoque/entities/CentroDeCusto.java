package com.ronaldo.gestao_estoque.entities;

import java.io.Serializable;
import java.util.Objects;

public class CentroDeCusto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id_centro_de_custo;
	private String nome;
	
	public CentroDeCusto() {
		
	}

	public CentroDeCusto(Long id_centro_de_custo, String nome) {
		super();
		this.id_centro_de_custo = id_centro_de_custo;
		this.nome = nome;
	}

	public Long getId_centro_de_custo() {
		return id_centro_de_custo;
	}

	public String getNome() {
		return nome;
	}

	public void setId_centro_de_custo(Long id_centro_de_custo) {
		this.id_centro_de_custo = id_centro_de_custo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_centro_de_custo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CentroDeCusto other = (CentroDeCusto) obj;
		return Objects.equals(id_centro_de_custo, other.id_centro_de_custo);
	}

}
