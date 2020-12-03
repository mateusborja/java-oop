/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.ultraemojicombat;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;

	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador() {
	}

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.categoria = this.getCategoria();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (peso <= 52.2) {
			this.categoria = "Invalido!";
		} else if (peso < 70.3) {
			this.categoria = "Peso Médio";
		} else if (peso <= 83.9) {
			this.categoria = "Peso Médio";
		} else if (peso <= 120) {
			this.categoria = "Peso Pesado";

		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public void apresentar() {
		System.out.println("\n*******************");
		System.out.println("CHEGOU A HORA DE APRESENTAMOS O LUTADOR >>> " + this.getNome());
		System.out.println("Diretamente de(a) " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m de altura.");
		System.out.println("pesando " + this.getPeso() + " Kg" + " categoria " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas e");
		System.out.println(this.getEmpates() + " empates.");

	}

	public void status() {
		System.out.println(this.getNome() + " é um " + this.getCategoria());
		System.out.println("ganho " + this.getVitorias() + ", ");
		System.out.println("perdeu " + this.getDerrotas() + ", ");
		System.out.println("e empatou " + this.getEmpates() + ".");
	}

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura
				+ ", peso=" + peso + ", categoria=" + categoria + ", vitorias=" + vitorias + ", derrotas=" + derrotas
				+ ", empates=" + empates + "]";
	}

}
