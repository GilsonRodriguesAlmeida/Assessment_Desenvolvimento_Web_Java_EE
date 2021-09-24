package br.edu.infnet.appSistemaEspecialistaEmFreios.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Estoque;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository.EstoqueRepository;

@Service
public class EstoqueService {
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	public List<Estoque> obterLista(Usuario usuario) {
		
		return estoqueRepository.obterLista(usuario.getId());
	}
	
	public List<Estoque> obterLista() {
		
		return (List<Estoque>) estoqueRepository.findAll();
	}
	
	public void incluir(Estoque estoque) {
		
		estoqueRepository.save(estoque);
	}
	
	public void excluir(Integer id) {
		
		estoqueRepository.deleteById(id);
	}

	public Estoque obterPorId(Integer id) {
		
		return estoqueRepository.findById(id).orElse(null);
	}

	public Integer qtdeItems() {
		
		return (int) estoqueRepository.count();
	}
	
}
