package com.ronaldo.gestao_estoque.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_centro_de_custo")
public class CentroDeCusto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
