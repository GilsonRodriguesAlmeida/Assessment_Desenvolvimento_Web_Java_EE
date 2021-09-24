package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Produto;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.ProdutoService;

@Controller
public class ProdutoController {
	
	
	@Autowired
	private ProdutoService produtoService;

	@GetMapping (value = "produto/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario ) {

		model.addAttribute("produtos", produtoService.obterLista(usuario));
		
		return "produto/lista";
	}
	
	@GetMapping(value = "/produto/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Produto produto = produtoService.obterPorId(id);
		
		String mensagem = null;

		try {
			produtoService.excluir(id);
			mensagem = "Produto: "+ produto.getDescricao() + " excluido!";
		} catch (Exception e) {
			mensagem = "Produto: "+ produto.getDescricao() + " não pode ser excluido!";
		}
		
		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}

}
