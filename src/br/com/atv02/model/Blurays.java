package br.com.atv02.model;

import java.util.Arrays;

public class Blurays extends Filme {
	private String idiomas[] = new String[2];

	public Blurays() {

	}

	public Blurays(String codigo, String titulo, String genero, int anoLancamento, int duracao, String idioma1,
			String idioma2) {
		super(codigo, titulo, genero, anoLancamento, duracao);
		this.idiomas[0] = idioma1;
		if (idioma2 != null)
			this.idiomas[1] = idioma2;
	}

	public String[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}

	public double calcularDiaria() {
		return 15;
	}

	@Override
	public String toString() {
		return "Blurays [idiomas=" + Arrays.toString(idiomas) + ", getAnoLancamento()=" + getAnoLancamento()
				+ ", getDuracao()=" + getDuracao() + ", toString()=" + super.toString() + ", getCodigo()=" + getCodigo()
				+ ", getTitulo()=" + getTitulo() + ", getGenero()=" + getGenero() + ", isLocado()=" + isLocado()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
