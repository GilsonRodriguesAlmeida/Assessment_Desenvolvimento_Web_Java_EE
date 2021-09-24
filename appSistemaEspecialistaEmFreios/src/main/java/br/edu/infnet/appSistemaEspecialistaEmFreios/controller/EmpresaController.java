package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Empresa;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.EmpresaService;

@Controller
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping(value = "/empresa")
	public String tela() {
		
		return "empresa/cadastro";
	}
	
	@GetMapping(value = "/empresa/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("lista", empresaService.obterLista(usuario));
		
		return "empresa/lista";
	}
	
	@PostMapping(value = "/empresa/incluir")
	public String incluir(Model model, Empresa empresas, @SessionAttribute("user") Usuario usuario) {
		
		empresas.setUsuario(usuario);
		
		empresaService.incluir(empresas);
		
		String mensagem = "O cliente " + empresas.getNome() + " foi cadastrada com Sucesso!!!";
		model.addAttribute("msg", mensagem);

		return telaLista(model, usuario);
	}
	
	@GetMapping(value =  "/empresa/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Empresa empresas = empresaService.obterPorId(id);
		
		String mensagem = null;
		
		try {
			empresaService.excluir(id);
			mensagem = "O cliente " + empresas.getNome() + " foi excluido com Sucesso!!!";
			
		} catch (Exception e) {
			mensagem = "Não foi possível excluir a Empresa " + empresas.getNome() + " !!!";
		}

		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}
}
