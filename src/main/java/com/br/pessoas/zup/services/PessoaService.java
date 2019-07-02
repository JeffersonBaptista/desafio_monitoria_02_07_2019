package com.br.pessoas.zup.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.pessoas.zup.models.PessoaModel;

@Service
public class PessoaService {
	
	private List<PessoaModel> pessoaBancoDeDados = new ArrayList<PessoaModel>(Arrays.asList(new PessoaModel(1, "Vinicius", "(11) 99754-3876", 25, "Cabelos longos, e olhos azuis"), new PessoaModel(2, "Carlos Vitor", "(11) 98653-9897", 22, "Cabelos medios, e olhos castanhos")));
	
	public List<PessoaModel> buscarTodos(){
		return pessoaBancoDeDados;
	}
	
	public void salvarPessoa(PessoaModel pessoa) {
		pessoaBancoDeDados.add(pessoa);
	}
	
	public PessoaModel buscarPessoa(int id) {
		PessoaModel pessoa = null;
		
		for (PessoaModel retorno : pessoaBancoDeDados) {
			if(retorno.getId() == id) {
				pessoa = retorno;
			}
		}
		return pessoa;
	}
	
}
