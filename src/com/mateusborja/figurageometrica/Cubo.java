/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.figurageometrica;

public class Cubo extends Figura3D implements DimensaoSuperficie, DimensaoVolumetrica {

	private double lado;

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}

	@Override
	public double calcularArea() {
		return 6 * Math.pow(lado, 2);
	}

}
