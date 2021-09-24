package br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Fluido;

@Repository
public interface FluidoRepository extends CrudRepository<Fluido, Integer>{

	@Query("from Fluido f where f.usuario.id = :userId")
	public List<Fluido> obterLista(Integer userId);
}
