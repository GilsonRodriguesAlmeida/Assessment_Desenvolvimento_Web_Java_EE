package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Estoque;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Produto;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.EmpresaService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.EstoqueService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.ProdutoService;

@Controller
public class EstoqueController {

	@Autowired
	private EstoqueService estoqueService;
	@Autowired
	private EmpresaService empresaService;
	@Autowired
	private ProdutoService produtoService;
	
	
	@GetMapping(value = "/estoque") 
	public String tela(Model model, @SessionAttribute("user") Usuario usuario ) {
		
		model.addAttribute("empresas", empresaService.obterLista(usuario));
		
		model.addAttribute("produtos", produtoService.obterLista(usuario));
		
		return "estoque/cadastro";
	}
	
	@GetMapping(value = "/estoque/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("lista", estoqueService.obterLista(usuario));
		
		return "estoque/lista";
	}
	
	@PostMapping(value = "/estoque/incluir")
	public String incluir(Model model, Estoque estoque, @RequestParam String[] produtosId,@SessionAttribute("user") Usuario usuario) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		for(String id : produtosId) {
			produtos.add(produtoService.obterPorId(Integer.valueOf(id)));
		}
		
		estoque.setProdutos(produtos);
		
		estoque.setUsuario(usuario);
		
		estoqueService.incluir(estoque);
		
		String mensagem = "Estoque " + estoque.getDescricao() + " foi cadastrado com Sucesso!!!";
		model.addAttribute("msg", mensagem);

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/estoque/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Estoque estoque = estoqueService.obterPorId(id);
		
		String mensagem = null;
		
		try {
			estoqueService.excluir(id);
			mensagem = "Estoque: "+ estoque.getDescricao() + " excluido com sucesso!";
			
		} catch (Exception e) {
			mensagem = "Estoque: "+ estoque.getDescricao() + " não pode ser excluido!";
		}
		
		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}
}