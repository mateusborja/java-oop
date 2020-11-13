/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer � 3D Artist � Developer
 * at www.mateusborja.life
 */

package com.mateusborja.eletrodomestico;

public class AplicacaoEletrodomestico {

	public static void main(String[] args) {

		Geladeira geladeira1 = new Geladeira(110, true);

		Radio radio1 = new Radio(110);

		radio1.ligar();
		radio1.setNome("Jovem Pan");
		radio1.setSintonia(99.1f);
		radio1.setVolume(69);
		System.out.print("O Radio " + radio1.getNome() + radio1.FM + " est� ");
		System.out.print(radio1.isLigado() ? "ligada " : " desligada ");
		System.out.println("e \"Sintonizado\" em " + radio1.getSintonia() + " no volume " + radio1.getVolume());

		geladeira1.ligar();
		geladeira1.setModelo("Brastemp");

		System.out.print("\nA Geladeira " + geladeira1.getModelo());
		System.out.println(geladeira1.isLigado() ? " est� ligada." : "desligada.");

	}

}
