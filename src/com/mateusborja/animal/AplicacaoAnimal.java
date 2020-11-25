/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.animal;

public class AplicacaoAnimal {

	public static void main(String[] args) {

		Gato gato = new Gato();
		gato.setNome("Rodolfo");
		gato.setRaca("Felino");
		System.out.println(gato);
		gato.emitirSom();

		Papagaio papagaio = new Papagaio();
		papagaio.setNome("Felix");
		System.out.println(papagaio);
		papagaio.emitirSom();

		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Joaquim");
		cachorro.setRaca("Poodle");
		cachorro.setTamanho("Médio");
		System.out.println(cachorro);
		cachorro.emitirSom();
		cachorro.alimentar();

		Cavalo cavalo = new Cavalo();
		cavalo.setNome("ZePeiru");
		cavalo.setRaca("Mangalarga");
		System.out.println(cavalo);
		cavalo.emitirSom();

	}

}
