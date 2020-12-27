package br.com.atv02.model;

public class CDs extends Musica {
	private boolean arranhado, duplo;

	public CDs() {
	
	}

	public CDs(String codigo, String titulo, String genero, String autor, int numFaixas, boolean arranhado, boolean duplo) {
		super(codigo, titulo, genero, autor, numFaixas);
		this.arranhado = arranhado;
		this.duplo = duplo;
	}

	public boolean isArranhado() {
		return arranhado;
	}

	public boolean isDuplo() {
		return duplo;
	}

	public void setArranhado(boolean arranhado) {
		this.arranhado = arranhado;
	}

	public void setDuplo(boolean duplo) {
		this.duplo = duplo;
	}
	
	public double calcularDiaria(){
		return 10;
	}
	
	@Override
	public String toString() {
		return "CDs [arranhado=" + arranhado + ", duplo=" + duplo + "]";
	}

}
