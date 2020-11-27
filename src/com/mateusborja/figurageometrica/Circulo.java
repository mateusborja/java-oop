/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.figurageometrica;

public class Circulo extends Figura2D implements DimensaoSuperficie {

	private double raio;

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
