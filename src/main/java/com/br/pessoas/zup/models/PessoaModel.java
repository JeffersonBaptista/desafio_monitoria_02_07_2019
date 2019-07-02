package com.br.pessoas.zup.models;

public class PessoaModel {
	
	private int id;
	private String nome;
	private String numeroTelefone;
	private String detalhes; 
	private int idade;

	public PessoaModel() {

	}

	public PessoaModel(int id, String nome, String numeroTelefone, int idade, String detalhes) {
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.detalhes = detalhes;
	}
	
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
}
