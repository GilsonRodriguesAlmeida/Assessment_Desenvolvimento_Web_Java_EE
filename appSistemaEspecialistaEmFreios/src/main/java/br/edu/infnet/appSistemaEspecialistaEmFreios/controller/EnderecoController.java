package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.EnderecoService;

@Controller
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;

	@PostMapping(value = "/cep")
	public String obterCep(Model model, @RequestParam String cep) {

		model.addAttribute("enderecoBusca", enderecoService.obterCep(cep));
		
		return "usuario/cadastroUsuario";
	}
}
