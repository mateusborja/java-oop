/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.animal;

public class Cavalo extends Mamifero implements AnimalDomestico {

	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	void amamentar() {
		System.out.println("Cavalo está amamentando");

	}

	@Override
	void emitirSom() {
		System.out.println("Irrriihh Irrriihhhh Irrriiihhh");

	}

	@Override
	public void levarVeterinario() {
		System.out.println("Levando o Cavalo ao Veterinário");

	}

	@Override
	public void alimentar() {
		System.out.println("Alimentando o Cavalo");

	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nRaça do Cavalo: " + this.raca;
		return s;

	}

}
