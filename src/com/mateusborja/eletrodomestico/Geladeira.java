/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.eletrodomestico;

public class Geladeira extends Eletrodomestico {

	private String modelo;
	private String fabricante;
	private Long barCode;
	private double consumo;
	private boolean controleTemperatura;
	private int capacidadeArmazenamento;
	private int quantidadePortas;

	public Geladeira(int voltagem, boolean ligado) {
		super(voltagem, ligado);
		setModelo(modelo);
		setBarCode(0l);
		setControleTemperatura(controleTemperatura);

	}

	public Geladeira(String nome, int voltagem, boolean ligado) {
		super(nome, voltagem, ligado);
	}

	@Override
	public void ligar() {
		super.setLigado(true);
		setFabricante("Brastemp");
		setModelo("Hitech-HC");
		setQuantidadePortas(3);

	}

	@Override
	public void desligar() {

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Long getBarCode() {
		return barCode;
	}

	public void setBarCode(Long barCode) {
		this.barCode = barCode;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public boolean isControleTemperatura() {
		return controleTemperatura;
	}

	public void setControleTemperatura(boolean controleTemperatura) {
		this.controleTemperatura = controleTemperatura;
	}

	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}

	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
}
