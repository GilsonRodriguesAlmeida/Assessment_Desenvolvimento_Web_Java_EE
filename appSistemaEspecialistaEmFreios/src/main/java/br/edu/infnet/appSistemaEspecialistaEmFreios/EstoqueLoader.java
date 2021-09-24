package br.edu.infnet.appSistemaEspecialistaEmFreios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Disco;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Empresa;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Estoque;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Fluido;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Pastilha;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Produto;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.EstoqueService;

@Component
@Order(4)
public class EstoqueLoader implements ApplicationRunner {

	@Autowired
	private EstoqueService estoqueService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Empresa empresa = new Empresa();
		empresa.setId(1);

		Disco d1 = new Disco();
		d1.setId(1);

		Fluido f1 = new Fluido();
		f1.setId(2);
		
		Pastilha p1 = new Pastilha();
		p1.setId(3);

		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(d1);
		produtos.add(f1);
		produtos.add(p1);
		
		Estoque estoque = new Estoque();
		estoque.setDescricao("Pedido Oficina Marcos");
		estoque.setProdutos(produtos);
		estoque.setEmpresas(empresa);
		estoque.setUsuario(usuario);
		
		estoqueService.incluir(estoque);
	}

}
