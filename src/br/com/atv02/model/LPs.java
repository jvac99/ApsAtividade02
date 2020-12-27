package br.com.atv02.model;

public class LPs extends Musica {
	private boolean raro;

	public LPs() {

	}

	public LPs(String codigo, String titulo, String genero, String autor, int numFaixas, boolean raro) {
		super(codigo, titulo, genero, autor, numFaixas);
		this.raro = raro;
	}

	public boolean isRaro() {
		return raro;
	}

	public void setRaro(boolean raro) {
		this.raro = raro;
	}

	public double calcularDiaria() {
		return 20;
	}

	@Override
	public String toString() {
		return "LPs [raro=" + raro + ", getAutor()=" + getAutor() + ", getNumFaixas()=" + getNumFaixas()
				+ ", toString()=" + super.toString() + ", getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo()
				+ ", getGenero()=" + getGenero() + ", isLocado()=" + isLocado() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
