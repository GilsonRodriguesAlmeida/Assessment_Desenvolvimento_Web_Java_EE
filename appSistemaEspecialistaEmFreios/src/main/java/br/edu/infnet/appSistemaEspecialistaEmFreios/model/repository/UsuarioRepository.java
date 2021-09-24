package br.edu.infnet.appSistemaEspecialistaEmFreios.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	@Query("from Usuario l where l.email = :email and l.senha = :senha")
	public Usuario autenticacao(String email, String senha);
}
