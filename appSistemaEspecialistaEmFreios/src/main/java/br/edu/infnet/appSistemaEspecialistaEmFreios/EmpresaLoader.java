package br.edu.infnet.appSistemaEspecialistaEmFreios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Empresa;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.EmpresaService;

@Component
@Order(2)
public class EmpresaLoader implements ApplicationRunner {

	@Autowired
	private EmpresaService empresaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Empresa empresa = new Empresa("Marcos Oficina", "marcos@gmail.com", "3330-2220", "40.997.217/0001-32");
		empresa.setUsuario(usuario);
		
		empresaService.incluir(empresa);

	}
	
}
