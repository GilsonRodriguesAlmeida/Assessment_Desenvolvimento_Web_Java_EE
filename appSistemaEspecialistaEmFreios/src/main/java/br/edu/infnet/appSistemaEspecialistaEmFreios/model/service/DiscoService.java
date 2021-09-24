package br.edu.infnet.appSistemaEspecialistaEmFreios.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Disco;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository.DiscoRepository;

@Service
public class DiscoService {

	@Autowired
	private DiscoRepository discoRepository;
	
	public List<Disco> obterLista(Usuario usuario) {
		
		return (List<Disco>) discoRepository.obterLista(usuario.getId());
	}
	
	public List<Disco> obterLista() {
		
		return (List<Disco>) discoRepository.findAll();
	}
	
	public void incluir(Disco disco) {
		
		discoRepository.save(disco);
	}
	
	public void excluir(Integer id) {
		
		discoRepository.deleteById(id);
	}
	
	public Disco obterPorId(Integer id) {
		
		return discoRepository.findById(id).orElse(null);
	}

	public Integer qtdeItems() {
		
		return (int) discoRepository.count();
	}
}
