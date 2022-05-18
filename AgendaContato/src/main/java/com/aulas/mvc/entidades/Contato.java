package com.aulas.mvc.entidades;

public class Contato {
	private int id;
	private String nome;
	private String email;

	
	

	public Contato(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
	}

	public Contato(int id, String nome, String email) {
	
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public Contato() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
