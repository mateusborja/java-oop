/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.figurageometrica;

import java.text.DecimalFormat;

public class AplicacaoFiguraGeometrica {

	public static void main(String[] args) {

		DecimalFormat dc = new DecimalFormat();

		FiguraGeometrica figuras[] = new FiguraGeometrica[7];

		Quadrado q1 = new Quadrado();
		q1.setNome("Quadrado");
		q1.setLado(4);

		Retangulo r1 = new Retangulo();
		r1.setNome("Retangulo");
		r1.setBase(5);
		r1.setAltura(15);

		Triangulo t1 = new Triangulo();
		t1.setNome("Triangulo");
		t1.setBase(3);
		t1.setAltura(8);

		Circulo c1 = new Circulo();
		c1.setNome("Circulo");
		c1.setRaio(3);

		Cubo cc1 = new Cubo();
		cc1.setNome("Cubo");
		cc1.setLado(4);

		Cilindro cl1 = new Cilindro();
		cl1.setNome("Cilindro");
		cl1.setRaio(3);
		cl1.setAltura(6);

		Piramide p1 = new Piramide();
		p1.setNome("Piramide");
		p1.setAltura(3);
		p1.setApotema(4);
		p1.setArestaBase(2);
		p1.setNumPolyBase(4);
		p1.setBase(q1);

		figuras[0] = q1;
		figuras[1] = r1;
		figuras[2] = t1;
		figuras[3] = c1;
		figuras[4] = cc1;
		figuras[5] = cl1;
		figuras[6] = p1;

		for (FiguraGeometrica figura : figuras) {
			System.out.println("*************");
			System.out.println(figura.getNome());
			if (figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				System.out.println("Area: " + dc.format(f2d.calcularArea()) + " m.");
			}

			if (figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura;
				System.out.println("Area: " + dc.format(f3d.calcularArea()) + " m.");
				System.out.println("Volume: " + dc.format(f3d.calcularVolume()) + " m3.");

			}

		}

	}

}
