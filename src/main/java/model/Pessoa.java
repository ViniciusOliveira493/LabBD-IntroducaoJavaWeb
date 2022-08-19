package model;

import java.util.Date;

public class Pessoa {
	private int id;
	private String nome;
	private Date dataNasc;
	
	
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
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	@Override
	public String toString() {
		return id + " | "+nome+" | "+ dataNasc;
	}
	
	
}
