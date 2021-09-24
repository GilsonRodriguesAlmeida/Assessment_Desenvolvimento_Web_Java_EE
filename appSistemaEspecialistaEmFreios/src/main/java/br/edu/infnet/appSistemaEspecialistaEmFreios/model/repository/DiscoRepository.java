package br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Disco;

@Repository
public interface DiscoRepository extends CrudRepository<Disco, Integer>{
	
	@Query("from Disco d where d.usuario.id = :userId")
	public List<Disco> obterLista(Integer userId);
}
