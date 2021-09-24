package br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain;

import javax.persistence.Entity;

@Entity
public class Fluido extends Produto {

	private String peso;
	private int fluidoNumero;
	private String tamanho;
	
	public Fluido() {
		
	}
	
	public Fluido(String descricao, int quantidade, String marcaDoProduto) {
		super(descricao, quantidade, marcaDoProduto);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.peso);
		sb.append(";");
		sb.append(this.fluidoNumero);
		sb.append(";");
		sb.append(this.tamanho);
		sb.append(";");
		sb.append(this.calcularValor());
		
		return sb.toString();
	}

	@Override
	public float calcularValor() {
		return 50 * this.quantidade;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public int getFluidoNumero() {
		return fluidoNumero;
	}

	public void setFluidoNumero(int fluidoNumero) {
		this.fluidoNumero = fluidoNumero;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
