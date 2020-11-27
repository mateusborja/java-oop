/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.figurageometrica;

public class Cilindro extends Figura3D implements DimensaoSuperficie, DimensaoVolumetrica {

	private double altura;
	private double raio;

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * (raio * raio) * altura;
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.PI * (raio * raio);
		double areaLateral = (2 * Math.PI) * (raio * altura);
		double areaTotal = (2 * areaBase) + areaLateral;
		return areaTotal;
	}

}
