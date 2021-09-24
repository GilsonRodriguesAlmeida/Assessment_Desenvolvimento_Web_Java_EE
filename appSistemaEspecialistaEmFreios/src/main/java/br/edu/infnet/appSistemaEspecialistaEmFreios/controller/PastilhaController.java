package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Pastilha;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.PastilhaService;

@Controller
public class PastilhaController {
	
	
	@Autowired
	private PastilhaService pastilhaService;

	@GetMapping (value = "/pastilha/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("pastilha", pastilhaService.obterLista(usuario));
		
		return "pastilha/lista";
	}

	@GetMapping(value = "/pastilha")
	public String telaCadastro() {
		
		return "pastilha/cadastro";
	}
	
	@PostMapping(value = "/pastilha/incluir")
	public String incluir(Model model, Pastilha pastilha, @SessionAttribute("user") Usuario usuario) {
		
		pastilha.setUsuario(usuario);
		
		pastilhaService.incluir(pastilha);
		
		model.addAttribute("msg", "Produto: "+ pastilha.getDescricao() + " cadastrado com sucesso!");

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/pastilha/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Pastilha pastilha = pastilhaService.obterPorId(id);
		
		String mensagem = null;
		
		try {
			pastilhaService.excluir(id);
			mensagem = "Produto: "+ pastilha.getDescricao() + " excluido com sucesso!";
			
		} catch (Exception e) {
			mensagem = "Produto: "+ pastilha.getDescricao() + " não pode ser excluido!";
		}
		
		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}

}
