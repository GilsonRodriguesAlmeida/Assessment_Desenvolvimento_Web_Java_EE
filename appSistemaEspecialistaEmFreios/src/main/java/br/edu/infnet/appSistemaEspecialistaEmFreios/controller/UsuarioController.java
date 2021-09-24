package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Endereco;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/user")
	public String telaCadastro() {
		
		return "usuario/cadastroUsuario";
	}
	
	@GetMapping(value = "usuario/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("lista", usuarioService.obterLista());
		
		return "usuario/lista";
	}

	@PostMapping(value = "/user")
	public String incluir(Usuario usuario, Endereco endereco) {
		
		usuario.setEndereco(endereco);
		
		usuarioService.incluir(usuario);
		
		return "redirect:/";
	}
	
	@GetMapping("/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		usuarioService.excluir(id);
		
		return "redirect:/usuario/lista";
	}
}
