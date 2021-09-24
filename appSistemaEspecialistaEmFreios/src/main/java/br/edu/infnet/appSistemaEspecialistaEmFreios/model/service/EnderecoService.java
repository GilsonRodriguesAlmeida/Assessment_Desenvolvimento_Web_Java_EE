package br.edu.infnet.appSistemaEspecialistaEmFreios.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appSistemaEspecialistaEmFreios.Clients.IEnderecoClient;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Endereco;

@Service
public class EnderecoService {

	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterCep(String cep ) {

		return enderecoClient.obterCep(cep);
	}
}
