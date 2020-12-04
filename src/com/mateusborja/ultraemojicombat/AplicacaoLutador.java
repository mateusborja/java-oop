/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.ultraemojicombat;

public class AplicacaoLutador {

	public static void main(String[] args) {

		Lutador lutador1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		Lutador lutador2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		Lutador lutador3 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		Lutador lutador4 = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		Lutador lutador5 = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		Lutador lutador6 = new Lutador("Nerdard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

		System.out.println(lutador1);
		lutador1.apresentar();
		
		System.out.println(lutador2);
		lutador2.apresentar();
		
		System.out.println(lutador3);
		lutador3.apresentar();
		
		System.out.println(lutador4);
		lutador4.apresentar();
		
		System.out.println(lutador5);
		lutador5.apresentar();
		
		System.out.println(lutador6);
		lutador6.apresentar();

	}

}
