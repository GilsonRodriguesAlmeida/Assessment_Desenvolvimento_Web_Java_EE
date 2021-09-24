package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Disco;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.DiscoService;

@Controller
public class DiscoController {
	
	
	@Autowired
	private DiscoService discoService;

	@GetMapping (value = "disco/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario ) {

		model.addAttribute("disco", discoService.obterLista(usuario));
		
		return "disco/lista";
	}

	@GetMapping(value = "/disco")
	public String telaCadastro() {
		
		return "disco/cadastro";
	}
	
	@PostMapping(value = "/disco/incluir")
	public String incluir(Model model, Disco disco, @SessionAttribute("user") Usuario usuario) {
		
		disco.setUsuario(usuario);
		
		discoService.incluir(disco);
		
		model.addAttribute("msg", "Produto: "+ disco.getDescricao() + " cadastrado com sucesso!");

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/disco/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Disco disco = discoService.obterPorId(id);
		
		String mensagem = null;
		
		try {
			discoService.excluir(id);
			mensagem = "Produto: "+ disco.getDescricao() + " excluido com sucesso!";
			
		} catch (Exception e) {
			mensagem = "Produto: "+ disco.getDescricao() + " não pode ser excluido!";
		}
		
		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}

}
