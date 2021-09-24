package br.edu.infnet.appSistemaEspecialistaEmFreios.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class AppTeste {

	public static void main(String[] args) {
		
		try {
			
			String arq = "estoq.txt";
			
			
			try {
				//FileWriter filew = new FileWriter(dir + arq);
				//BufferedWriter escrita = new BufferedWriter(filew);
				
				FileReader file = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = leitura.readLine();
				
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					if(campos.length == 5) {
						System.out.println("Dados Empresa");
					} else {
						switch (campos[0].toUpperCase()) {
						case "D":
							System.out.println("Disco");
							break;
						
						case "F":
							System.out.println("Fluido");
							break;
							
						case "P":
							System.out.println("Pastilha");
							break;
							
						default:
							System.out.println("Entrada inválida!");
							break;
						}
					}
					
					linha = leitura.readLine();
				}
				
				file.close();
				leitura.close();
				//escrita.close();
				//filew.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Processo finalizado!");
		}
	}
}
