package br.edu.infnet.appSistemaEspecialistaEmFreios.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Pastilha;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository.PastilhaRepository;

@Service
public class PastilhaService {

	@Autowired
	private PastilhaRepository pastilhaRepository;
	
	public List<Pastilha> obterLista(Usuario usuario) {
		
		return (List<Pastilha>) pastilhaRepository.obterLista(usuario.getId());
	}
	
	public List<Pastilha> obterLista() {
		
		return (List<Pastilha>) pastilhaRepository.findAll();
	}
	
	public void incluir(Pastilha pastilha) {
		
		pastilhaRepository.save(pastilha);
	}
	
	public void excluir(Integer id) {
		
		pastilhaRepository.deleteById(id);
	}
	
	public Pastilha obterPorId(Integer id) {
		
		return pastilhaRepository.findById(id).orElse(null);
	}

	public Integer qtdeItems() {
		
		return (int) pastilhaRepository.count();
	}
}
