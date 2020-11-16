/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.imposto;

public class AplicacaoImposto {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(1255);
		CalculadorDeImpostos c1 = new CalculadorDeImpostos();
		CalculadorDeImpostos c2 = new CalculadorDeImpostos();
		CalculadorDeImpostos c3 = new CalculadorDeImpostos();

		ICMS icms = new ICMS();
		ISS iss = new ISS();

		System.out.println("Orçamento inicial R$ " + orcamento.getValor());
		c1.calcula(orcamento, icms);
		c1.calcula(orcamento, iss);

		System.out.println();
		orcamento.setValor(3500);
		System.out.println("Orçamento mês MM R$ " + orcamento.getValor());
		c2.calcula(orcamento, icms);
		c2.calcula(orcamento, iss);

		System.out.println();
		orcamento.setValor(5500);
		System.out.println("Orçamento mês MM R$ " + orcamento.getValor());
		c3.calcula(orcamento, icms);
		c3.calcula(orcamento, iss);

	}

}
