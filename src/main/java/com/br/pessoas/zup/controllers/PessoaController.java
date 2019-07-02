package com.br.pessoas.zup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.pessoas.zup.models.PessoaModel;
import com.br.pessoas.zup.services.PessoaService;

@Controller
public class PessoaController {

	@Autowired
	private PessoaService pessoService;
	
	@GetMapping("/")
	public ModelAndView mostrarPessoas() {
		ModelAndView modelAndView = new ModelAndView("pessoas.html");
		modelAndView.addObject("pessoas", pessoService.buscarTodos());
		return modelAndView;
		
	}
	
	@GetMapping("/cadastro")
	public ModelAndView cadastro() {
		ModelAndView modelAndView = new ModelAndView("cadastrar.html");
		return modelAndView;
	}
	
	@PostMapping("/cadastro")
	public String salvarPessoa(PessoaModel pessoa) {
		pessoService.salvarPessoa(pessoa);
		return "redirect:/";
	}
	
	@GetMapping("/detalhes/{id}")
	public ModelAndView buscarPessoa(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("pessoa.html");
		modelAndView.addObject("pessoa", pessoService.buscarPessoa(id));
		return modelAndView;
	}
}
