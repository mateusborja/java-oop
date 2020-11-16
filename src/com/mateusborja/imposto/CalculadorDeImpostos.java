/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.imposto;

public class CalculadorDeImpostos {

	public void calcula(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println("Valor do Imposto R$ " + imposto);
	}

}
