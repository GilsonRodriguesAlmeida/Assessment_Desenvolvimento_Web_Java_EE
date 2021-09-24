package br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain;

import javax.persistence.Entity;

@Entity
public class Disco extends Produto {
	
	private String modeloVeiculo;
	private String marca;
	private String tamanho;

	public Disco() {
		
	}
	public Disco(String descricao, int quantidade, String marcaDoProduto) {
		super(descricao, quantidade, marcaDoProduto);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.modeloVeiculo);
		sb.append(";");
		sb.append(this.marca);
		sb.append(";");
		sb.append(this.tamanho);
		sb.append(",");
		sb.append(this.calcularValor());
		
		return sb.toString();
	}

	@Override
	public float calcularValor() {
		return 100 * this.quantidade;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
