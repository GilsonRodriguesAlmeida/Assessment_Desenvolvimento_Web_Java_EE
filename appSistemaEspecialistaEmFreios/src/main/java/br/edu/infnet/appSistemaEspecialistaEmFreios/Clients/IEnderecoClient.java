package br.edu.infnet.appSistemaEspecialistaEmFreios.Clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoCli")
public interface IEnderecoClient {

	@GetMapping(value = "/{cep}/json")
	public Endereco obterCep(@PathVariable String cep);
}
