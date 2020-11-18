/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.eletrodomestico;

public class Geladeira extends Eletrodomestico {

	private String modelo;
	private String fabricante;
	private double consumo;

	public Geladeira(String modelo, boolean ligado) {
		super(modelo, ligado);
	}

	@Override
	public void ligar() {
		super.setLigado(true);
		setFabricante("Brastemp");
		setModelo("Fresh-HC");

	}

	@Override
	public void desligar() {
		super.setLigado(false);

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

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

}
