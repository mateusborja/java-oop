/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.eletrodomestico;

public class CalculadorVenda {

	public void realizaCalculo(Orcamento orcamento, Venda vendaqualquer, Eletrodomestico eletrodomestico) {
		double venda = vendaqualquer.calcula(orcamento);
		System.out.println("O item "+ eletrodomestico.getNome() + " foi vendido por R$ " + venda);
	}

}
