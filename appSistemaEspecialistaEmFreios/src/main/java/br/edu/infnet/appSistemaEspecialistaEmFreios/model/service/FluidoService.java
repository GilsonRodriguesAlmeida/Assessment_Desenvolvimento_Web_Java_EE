package br.edu.infnet.appSistemaEspecialistaEmFreios.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Fluido;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository.FluidoRepository;

@Service
public class FluidoService {

	@Autowired
	private FluidoRepository fluidoRepository;
	
	public List<Fluido> obterLista(Usuario usuario) {
		
		return (List<Fluido>) fluidoRepository.obterLista(usuario.getId());
	}
	
	public List<Fluido> obterLista() {
		
		return (List<Fluido>) fluidoRepository.findAll();
	}
	
	public void incluir(Fluido fluido) {
		
		fluidoRepository.save(fluido);
	}
	
	public void excluir(Integer id) {
		
		fluidoRepository.deleteById(id);
	}
	
	public Fluido obterPorID(Integer id) {
		
		return fluidoRepository.findById(id).orElse(null);
	}

	public Integer qtdeItems() {
		// TODO Auto-generated method stub
		return (int) fluidoRepository.count();
	}
}
