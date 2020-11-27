/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.figurageometrica;

public class Quadrado extends Figura2D implements DimensaoSuperficie {

	private double lado;

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

}
