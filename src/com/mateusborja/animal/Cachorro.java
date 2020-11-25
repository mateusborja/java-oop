/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.animal;

public class Cachorro extends Mamifero implements AnimalDomestico, AnimalEstimacao {

	private String raca;
	private String tamanho;

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	@Override
	void amamentar() {
		System.out.println("Cachorro está amamentando");

	}

	@Override
	void emitirSom() {
		System.out.println("Au Au Au.");

	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nRaça do Cachorro: " + this.raca;
		s += "\nTamanho do Cachorro: " + this.tamanho;
		return s;

	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void passear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void levarVeterinario() {
		System.out.println("Levando Cachorro no Veterinário");

	}

	@Override
	public void alimentar() {
		System.out.println("Cachorro está se Alimentando");

	}

}
