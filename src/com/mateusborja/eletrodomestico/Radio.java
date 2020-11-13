/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.eletrodomestico;

public class Radio extends Eletrodomestico {

	public static final short AM = 1;
	public static final short FM = 2;
	private int banda;
	private float sintonia;
	private int volume;

	public Radio(int voltagem) {
		super(voltagem, true);
		setBanda(Radio.FM);
		setSintonia(0);
		setVolume(0);
	}

	public void desligar() {
		super.setLigado(false);
		setSintonia(0);
		setVolume(0);
	}

	public void ligar() {
		super.setLigado(true);
		setSintonia(88.1f);
		setVolume(25);
	}

	public int getBanda() {
		return banda;
	}

	public void setBanda(int banda) {
		this.banda = banda;
	}

	public float getSintonia() {
		return sintonia;
	}

	public void setSintonia(float sintonia) {
		this.sintonia = sintonia;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
