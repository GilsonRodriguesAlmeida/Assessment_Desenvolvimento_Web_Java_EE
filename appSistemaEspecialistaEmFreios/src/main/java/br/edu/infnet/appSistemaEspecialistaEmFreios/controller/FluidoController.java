package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Fluido;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.FluidoService;

@Controller
public class FluidoController {
	
	
	@Autowired
	private FluidoService fluidoService;

	@GetMapping (value = "fluido/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("fluido", fluidoService.obterLista(usuario));
		
		return "fluido/lista";
	}

	@GetMapping(value = "/fluido")
	public String telaCadastro() {
		
		return "fluido/cadastro";
	}
	
	@PostMapping(value = "/fluido/incluir")
	public String incluir(Model model, Fluido fluido, @SessionAttribute("user") Usuario usuario) {
		
		fluido.setUsuario(usuario);
		
		fluidoService.incluir(fluido);
		
		model.addAttribute("msg", "Produto: "+ fluido.getDescricao() + " cadastrado com sucesso!");

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/fluido/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Fluido fluido = fluidoService.obterPorID(id);
		
		String mensagem = null;
		
		try {
			fluidoService.excluir(id);
			mensagem = "Produto: "+ fluido.getDescricao() + " excluido com sucesso!";
			
		} catch (Exception e) {
			mensagem = "Produto: "+ fluido.getDescricao() + " não pode ser excluido!";
		}
		
		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}

}
