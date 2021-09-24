package br.edu.infnet.appSistemaEspecialistaEmFreios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Disco;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Fluido;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Pastilha;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Usuario;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.DiscoService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.FluidoService;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.service.PastilhaService;

@Component
@Order(3)
public class ProdutoLoader implements ApplicationRunner {

	@Autowired
	private DiscoService discoService;
	@Autowired
	private FluidoService fluidoService;
	@Autowired
	private PastilhaService pastilhaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Disco d1 = new Disco("Disco/Freio", 1, "Dspachoal");
		d1.setMarca("Chevrolet");
		d1.setModeloVeiculo("Cruze");
		d1.setTamanho("22 mm");
		d1.setUsuario(usuario);
		
		discoService.incluir(d1);

		Fluido f1 = new Fluido("Fluido/Freio", 1, "Dpaschoal");
		f1.setPeso("0,350");
		f1.setFluidoNumero(3);
		f1.setTamanho("250 ml");
		f1.setUsuario(usuario);
		
		fluidoService.incluir(f1);
		
		Pastilha p1 = new Pastilha("Pastilha/Freio", 1, "Bosh");
		p1.setMarcaVeiculo("Renault");
		p1.setModeloVeiculo("Duster");
		p1.setMaterial("Pastilha metálica");
		p1.setUsuario(usuario);
		
		pastilhaService.incluir(p1);
		
	}

}
