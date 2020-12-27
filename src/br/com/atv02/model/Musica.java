package br.com.atv02.model;

public abstract class Musica extends Produto{
	private String autor;
	private int numFaixas;

	public Musica() {
		
	}

	public Musica(String codigo, String titulo, String genero, String autor, int numFaixas) {
		super(codigo, titulo, genero);
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
