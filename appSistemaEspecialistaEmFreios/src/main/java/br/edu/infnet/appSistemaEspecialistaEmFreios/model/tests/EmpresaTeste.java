package br.edu.infnet.appSistemaEspecialistaEmFreios.model.tests;

import br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain.Empresa;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		Empresa emp1 = new Empresa("Oficina Junior", "(41)998992368","10.888.0001-10","gilsonrodriguesalmeida2011@hotmail.com");
		System.out.println("Empresa: " + emp1);
	}

}
