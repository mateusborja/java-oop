/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.animal;

public abstract class Animal {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	abstract void emitirSom();

	@Override
	public String toString() {
		String s = "\n*** DADOS DO ANIMAL ***";
		s += "\nNome: " + this.nome;
		return s;
	}

}
