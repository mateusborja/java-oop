/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.figurageometrica;

public class Piramide extends Figura3D implements DimensaoSuperficie, DimensaoVolumetrica {

	private double altura;
	private double aresta;
	private double apotema;
	private int numPolyBase;
	private Figura2D base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return aresta;
	}

	public void setArestaBase(double arestaBase) {
		this.aresta = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public int getNumPolyBase() {
		return numPolyBase;
	}

	public void setNumPolyBase(int numPolyBase) {
		this.numPolyBase = numPolyBase;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	@Override
	public double calcularVolume() {
		if(base != null) {
			return ((numPolyBase * (aresta * apotema) / 2)) + base.calcularArea();
		}
		return 0;
	}

	@Override
	public double calcularArea() {
		if (base != null) {
			return ((base.calcularArea() * altura) / 3);
		}
		return 0;
	}

}
