package br.com.atv02.model;

import java.util.Arrays;

public class Blurays extends Filme {
	private String idiomas[] = new String[2];
           	
	public Blurays() {
		// TODO Auto-generated constructor stub
	}

	public Blurays(String[] idiomas) {
		super();
		this.idiomas = idiomas;
	}

	public String[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}
	
	public double calcularDiario(){
		return 15;
	}
	
	@Override
	public String toString() {
		return "Blurays [idiomas=" + Arrays.toString(idiomas) + "]";
	}

}
