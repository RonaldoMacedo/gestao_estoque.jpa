package com.ronaldo.gestao_estoque.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	private String descricao_interna;
	private String descricao_tecnica;
	private String codigo_ref;
	private String cod_barras;
	private String ativo;
	
	public Produto() {
		
	}

	public Produto(Long id_produto, String descricao_interna, String descricao_tecnica, String codigo_ref,
			String cod_barras, String ativo) {
		super();
		this.id_produto = id_produto;
		this.descricao_interna = descricao_interna;
		this.descricao_tecnica = descricao_tecnica;
		this.codigo_ref = codigo_ref;
		this.cod_barras = cod_barras;
		this.ativo = ativo;
	}

	public Long getId_produto() {
		return id_produto;
	}

	public String getDescricao_interna() {
		return descricao_interna;
	}

	public String getDescricao_tecnica() {
		return descricao_tecnica;
	}

	public String getCodigo_ref() {
		return codigo_ref;
	}

	public String getCod_barras() {
		return cod_barras;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public void setDescricao_interna(String descricao_interna) {
		this.descricao_interna = descricao_interna;
	}

	public void setDescricao_tecnica(String descricao_tecnica) {
		this.descricao_tecnica = descricao_tecnica;
	}

	public void setCodigo_ref(String codigo_ref) {
		this.codigo_ref = codigo_ref;
	}

	public void setCod_barras(String cod_barras) {
		this.cod_barras = cod_barras;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id_produto, other.id_produto);
	}

}
