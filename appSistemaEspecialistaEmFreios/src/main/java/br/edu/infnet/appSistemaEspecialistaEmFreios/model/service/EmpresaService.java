package br.edu.infnet.appSistemaEspecialistaEmFreios.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Empresa;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public List<Empresa> obterLista(Usuario usuario) {
		
		return empresaRepository.obterLista(usuario.getId());
	}
	
	public List<Empresa> obterLista() {
		
		return (List<Empresa>) empresaRepository.findAll();
	}
	
	public void incluir(Empresa empresa) {
		
		empresaRepository.save(empresa);
	}
	
	public void excluir(Integer id) {
		
		empresaRepository.deleteById(id);
	}

	public Empresa obterPorId(Integer id) {
		
		return empresaRepository.findById(id).orElse(null);
	}

	public Integer qtdeItems() {
		
		return (int) empresaRepository.count();
	}
}
