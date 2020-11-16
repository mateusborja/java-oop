/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.imposto;

public class AplicacaoImposto {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(1255);
		CalculadorDeImpostos calculo1 = new CalculadorDeImpostos();
		CalculadorDeImpostos calculo2 = new CalculadorDeImpostos();

		ICMS icms = new ICMS();
		ISS iss = new ISS();
		
		System.out.println("Orçamento mês R$ " + orcamento.getValor());
		calculo1.calcula(orcamento, icms);
		calculo1.calcula(orcamento, iss);
		
		orcamento.setValor(3500);
		System.out.println("R$ " + orcamento.getValor());

		calculo2.calcula(orcamento, icms);
		calculo2.calcula(orcamento, iss);
	}

}
