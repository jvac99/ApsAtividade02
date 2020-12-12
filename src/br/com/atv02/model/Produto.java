package br.com.atv02.model;

public abstract class Produto {
	private String codigo, titulo, genero;
	private boolean locado;

	public Produto() {
	}

	public String getCodigo() {
		return codigo;
	}

	public Produto(String codigo, String titulo, String genero, boolean locado) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.locado = locado;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public boolean isLocado() {
		return locado;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setLocado(boolean locado) {
		this.locado = locado;
	}

	public abstract double calcularDiario();

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", titulo=" + titulo + ", genero=" + genero + ", locado=" + locado + "]";
	}

}
