package com.san.application.entidade;

public class Paciente {

	private String cpf;
	private String nome;
	private String telefone;

	public Paciente() {

	}

	public Paciente(String cpf, String nome, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ncpf: " + cpf + "\nTelefone: " + telefone;
	}

}
