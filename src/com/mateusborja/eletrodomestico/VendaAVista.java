/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer � 3D Artist � Developer
 * at www.mateusborja.life
 */

package com.mateusborja.eletrodomestico;

public class VendaAVista implements Venda {
	

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() ;
	}

}
