/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.imposto;

public class ICMS implements Imposto {
	
	private static final String nome = "ICMS";
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	

}
