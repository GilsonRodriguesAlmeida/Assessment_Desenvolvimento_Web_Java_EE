package br.edu.infnet.appSistemaEspecialistaEmFreios.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario validar(String email, String senha) {
		
		return usuarioRepository.autenticacao(email, senha);
		
	}
	
	public void incluir(Usuario usuario) {
		
		usuarioRepository.save(usuario);
	}
	
	public void excluir(Integer id) {
		
		usuarioRepository.deleteById(id);
	}
	
	public List<Usuario> obterLista() {
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public Integer qtdeItems() {
		
		return (int) usuarioRepository.count();
	}
	
}
