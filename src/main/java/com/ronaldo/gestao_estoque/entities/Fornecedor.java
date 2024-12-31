package com.ronaldo.gestao_estoque.entities;

import java.io.Serializable;
import java.util.Objects;

public class Fornecedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id_fornecedor;
	private String razao_social;
	private String nome_fantasia;
	private String cnpj;
	private String ativo;
	
	public Fornecedor() {
		
	}

	public Fornecedor(Long id_fornecedor, String razao_social, String nome_fantasia, String cnpj, String ativo) {
		super();
		this.id_fornecedor = id_fornecedor;
		this.razao_social = razao_social;
		this.nome_fantasia = nome_fantasia;
		this.cnpj = cnpj;
		this.ativo = ativo;
	}

	public Long getId_fornecedor() {
		return id_fornecedor;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setId_fornecedor(Long id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_fornecedor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(id_fornecedor, other.id_fornecedor);
	}

}
