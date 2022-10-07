package com.san.application.transacoes;

import com.san.application.entidade.Consulta;
import com.san.application.entidade.Paciente;

public class ControleConsulta {

	private Consulta[] consultasAgendadas;
	private Paciente pacientes[];

	public ControleConsulta(int quantidadeConsulta, int quantidadePacientes) {
		consultasAgendadas = new Consulta[quantidadeConsulta];
		pacientes = new Paciente[quantidadePacientes];
	}

	public void cadastrarPaciente(Paciente paciente) {
		// adiciona novo cliente na lista de clientes
	}

	public Paciente buscarPacientePorCpf(String cpf) {
		// busca o paciente pelo cpf e retorna o paciente
		return new Paciente();
	}

	public Paciente buscarPacientePorNome(String nome) {
		// busca o paciente pelo nome e retorna o paciente
		return new Paciente();
	}

	public void exibirPaciente(int index) {
		// imprime os dados de um paciente dado o indice dele na lista
		// printar o toString
	}

	public void agendarConsulta(Consulta consulta) {
		// adiciona uma nova consulta na lista de consultas agendadas
	}

	public Consulta[] getConsultasAgendadas() {
		return consultasAgendadas;
	}

	public Paciente[] getPacientes() {
		return pacientes;
	}

}
