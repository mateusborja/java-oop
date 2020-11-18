/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.eletrodomestico;

public abstract class Eletrodomestico {

	private String nome;
	private int voltagem;
	private boolean ligado;

	public abstract void ligar();

	public abstract void desligar();

	public Eletrodomestico(String nome, boolean ligado) {
		this.setNome(nome);
		this.setLigado(ligado);
	}

	public Eletrodomestico(String nome, int voltagem, boolean ligado) {
		this.setNome(nome);
		this.setVoltagem(voltagem);
		this.setLigado(ligado);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVoltagem(int votagem) {
		this.voltagem = votagem;
	}

	public void setLigado(boolean ligado) {
		if (ligado)
			this.ligado = true;
		else
			this.ligado = false;
	}

	public String getNome() {
		return nome;
	}

	public double getVoltagem() {
		return voltagem;
	}

	public boolean isLigado() {
		return ligado;
	}

}
