package br.com.atv02.model;

public abstract class Musica {
	private String autor;
	private int numFaixas;

	public Musica() {
		// TODO Auto-generated constructor stub
	}

	public Musica(String autor, int numFaixas) {
		super();
		this.autor = autor;
		this.numFaixas = numFaixas;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

	@Override
	public String toString() {
		return "Musica [autor=" + autor + ", numFaixas=" + numFaixas + "]";
	}

}
