/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.animal;

public class Gato extends Mamifero {

	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	void amamentar() {
		System.out.println("Gato está amamentando");

	}

	@Override
	void emitirSom() {
		System.out.println("Miau Miau Miau");

	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nRaça do Gato: " + this.raca;
		return s;

	}

}
