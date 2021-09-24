package br.edu.infnet.appSistemaEspecialistaEmFreios.model.tests;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Estoque;

public class EstoqueTeste {

	public static void main(String[] args) {
		
		Estoque est1 = new Estoque("Pastilha");
		System.out.println("Produto: " + est1);
	}

}
