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
	private double valor;

	public Geladeira(String nome, boolean ligado) {
		super(nome, ligado);
		setModelo(modelo);

	}

	public Geladeira(String nome, int voltagem, boolean ligado) {
		super(nome, voltagem, ligado);
	}

	@Override
	public void ligar() {
		super.setLigado(true);
		setFabricante("Brastemp");
		setModelo("Hitech-HC");

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

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void vendaGeladeira(String modelo, double valor) {
		this.modelo = modelo;
		this.valor = valor;
		System.out.println("O item " + getModelo() + " foi vendido por R$ " + getValor());

	}

}
