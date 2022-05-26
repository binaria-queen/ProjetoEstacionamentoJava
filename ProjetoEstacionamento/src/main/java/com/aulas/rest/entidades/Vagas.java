package com.aulas.rest.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vagas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idvagas;
	private String tipo;
	private char status;

	public int getIdvagas() {
		return idvagas;
	}

	public void setIdvagas(int idvagas) {
		this.idvagas = idvagas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Vagas() {

	}

	public Vagas(int idvagas, String tipo, char status) {

		this.idvagas = idvagas;
		this.tipo = tipo;
		this.status = status;
	}

}
