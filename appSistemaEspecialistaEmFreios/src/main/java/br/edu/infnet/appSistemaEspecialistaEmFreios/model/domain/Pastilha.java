package br.edu.infnet.appSistemaEspecialistaEmFreios.model.domain;

import javax.persistence.Entity;

@Entity
public class Pastilha extends Produto{
	
	private String modeloVeiculo;
	private String marcaVeiculo;
	private String material;

	public Pastilha () {
		
	}
	
	public Pastilha(String descricao, int quantidade, String marcaDoProduto) {
		super(descricao, quantidade, marcaDoProduto);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.modeloVeiculo);
		sb.append(";");
		sb.append(this.marcaVeiculo);
		sb.append(";");
		sb.append(this.material);
		sb.append(";");
		sb.append(this.calcularValor());
		
		return sb.toString();
	}

	@Override
	public float calcularValor() {
		return 70 * this.quantidade;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
