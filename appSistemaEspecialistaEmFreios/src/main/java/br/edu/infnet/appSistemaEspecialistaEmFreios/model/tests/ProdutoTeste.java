package br.edu.infnet.appSistemaEspecialistaEmFreios.model.tests;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Disco;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Fluido;
import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Pastilha;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Disco d1 = new Disco("Disco de freio", 2, "22");
		d1.setMarca("Bosh");
		d1.setModeloVeiculo("GOL");
		System.out.println("Disco: " + d1);
		
		Disco d2 = new Disco("Disco de freio", 4, "24");
		d2.setMarca("Volks");
		System.out.println("Disco: " + d2);
		
		Fluido f1 = new Fluido("fluido para freio", 5, "Controil");
		f1.setPeso("0,250");
		f1.setFluidoNumero(5);
		System.out.println("Fluido: " + f1);
		
		Pastilha p1 = new Pastilha("Pastilha de freio", 4, "22");
		p1.setMarcaVeiculo("Renault");
		p1.setModeloVeiculo("Captur");
		System.out.println("Pastilha: " + p1);
	}
}
