package br.edu.infnet.appSistemaEspecialistaEmFreios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Endereco;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Costeira");
		endereco.setCep("83709272");
		endereco.setComplemento("Casa 12");
		endereco.setLocalidade("Araucaria");
		endereco.setLogradouro("Presidente 143");
		endereco.setUf("PR");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Gilson Rodrigues de Almeida");
		usuario.setEmail("gilson@gmail.com");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		usuario.setEndereco(endereco);
		
		usuarioService.incluir(usuario);

	}
	
}
