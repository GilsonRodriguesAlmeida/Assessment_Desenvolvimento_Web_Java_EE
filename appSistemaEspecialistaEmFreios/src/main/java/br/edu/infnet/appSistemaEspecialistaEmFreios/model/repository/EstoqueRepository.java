package br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Estoque;

public interface EstoqueRepository extends CrudRepository<Estoque, Integer>{

	@Query("from Estoque t where t.usuario.id = :userId")
	public List<Estoque> obterLista(Integer userId);
}
