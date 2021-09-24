package br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Pastilha;

@Repository
public interface PastilhaRepository extends CrudRepository<Pastilha, Integer>{

	@Query("from Pastilha p where p.usuario.id = :userId")
	public List<Pastilha> obterLista(Integer userId);
}
