package br.com.atv02.model;

public class CDs extends Musica {
	private boolean arranhado, duplo;

	public CDs() {
		// TODO Auto-generated constructor stub
	}

	public CDs(boolean arranhado, boolean duplo) {
		super();
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

	@Override
	public String toString() {
		return "CDs [arranhado=" + arranhado + ", duplo=" + duplo + "]";
	}

}
