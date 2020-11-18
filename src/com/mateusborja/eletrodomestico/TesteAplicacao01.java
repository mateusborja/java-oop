/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.eletrodomestico;

public class TesteAplicacao01 {

	public static void main(String[] args) {

		Geladeira geladeira1 = new Geladeira("Brastemp", true);
		Orcamento oc1 = new Orcamento(100);
		CalculadorVenda calculador = new CalculadorVenda();
		VendaAVista vendaavista = new VendaAVista();

		calculador.realizaCalculo(oc1, vendaavista, geladeira1);

	}

}
