package com.techafropretas.estoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity //mapeia a classe na database
@Table
public class Loja {
	
	@Id
	@SequenceGenerator(name="loja_sequence", sequenceName = "loja_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loja_sequence")
	private int idLoja;
	private String nome;
	private String cnpj;
	private String email;
	private String senha;
	
	
	
	public Loja() {
	}

	public Loja(String nome, String cnpj, String email, String senha) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.senha = senha;
	}

	public Loja(int idLoja, String nome, String cnpj, String email, String senha) {
		this.idLoja = idLoja;
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.senha = senha;
	}

	public int getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(int idLoja) {
		this.idLoja = idLoja;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String toSting() {
		return "Loja {"
				+ "id=" +idLoja+
				", nome = " +nome+ "email" + email+ "}";
	}
	
}
