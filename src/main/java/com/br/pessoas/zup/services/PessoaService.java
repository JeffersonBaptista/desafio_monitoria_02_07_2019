package com.br.pessoas.zup.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.pessoas.zup.models.PessoaModel;

@Service
public class PessoaService {

	private List<PessoaModel> pessoaBancoDeDados = new ArrayList<PessoaModel>();

	public List<PessoaModel> buscarTodos() {
		return pessoaBancoDeDados;
	}

	public void salvarPessoa(String nome, String numeroTelefone, int idade, String detalhes) {
		if (pessoaBancoDeDados.isEmpty()== true) {
			PessoaModel pessoa = new PessoaModel(0, nome, numeroTelefone, idade, detalhes);
			pessoaBancoDeDados.add(pessoa);
		} else {
			int id = pessoaBancoDeDados.size();
			PessoaModel pessoa = new PessoaModel(id, nome, numeroTelefone, idade, detalhes);
			pessoaBancoDeDados.add(pessoa);
		}
	}

	public PessoaModel buscarPessoa(int id) {
		PessoaModel pessoa = null;

		for (PessoaModel retorno : pessoaBancoDeDados) {
			if (retorno.getId() == id) {
				pessoa = retorno;
			}
		}
		return pessoa;
	}

}
