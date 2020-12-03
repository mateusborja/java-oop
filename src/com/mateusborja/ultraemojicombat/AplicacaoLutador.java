/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.ultraemojicombat;

public class AplicacaoLutador {

	public static void main(String[] args) {

		Lutador lutador1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);

		lutador1.setCategoria();
		System.out.println(lutador1);
		lutador1.apresentar();

	}

}
