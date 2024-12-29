package com.ronaldo.gestao_estoque.entities;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id_usuario;
	private String nome;
	
	public Usuario() {
		
	}

	public Usuario(Long id_usuario, String nome) {
		super();
		this.id_usuario = id_usuario;
		this.nome = nome;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id_usuario, other.id_usuario);
	}

}
