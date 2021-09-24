package br.edu.infnet.appSistemaEspecialistaEmFreios.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.DiscoService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.EmpresaService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.EstoqueService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.FluidoService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.PastilhaService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AcessoController {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private EmpresaService empresaService;
	@Autowired
	private DiscoService discoService;
	@Autowired
	private FluidoService fluidoService;
	@Autowired
	private PastilhaService pastilhasService;
	@Autowired
	private EstoqueService estoqueService;
	
	@GetMapping(value = "/dados")
	public  String dados(Model model) {
		
		Map<String, Integer> mapaDados = new HashMap<String, Integer>();
		
		mapaDados.put("Usuários", usuarioService.qtdeItems());
		mapaDados.put("Empresas", empresaService.qtdeItems());
		mapaDados.put("Disco", discoService.qtdeItems());
		mapaDados.put("Fluido", fluidoService.qtdeItems());
		mapaDados.put("Pastilhas", pastilhasService.qtdeItems());
		mapaDados.put("Estoque", estoqueService.qtdeItems());
		
		model.addAttribute("contagem", mapaDados);
		
		return "dados";
	}

	@GetMapping(value = "/")
	public String telaHome() {

		return "index";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}

	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {

		Usuario logado = usuarioService.validar(email, senha);

		if (logado != null) {
			
			model.addAttribute("user", logado);
			
			return "index";

		} else {
			
			model.addAttribute("mensagem", "Autenticação inválida para o usuário " + email +"!!!");
			return "login";

		}
	}
}
