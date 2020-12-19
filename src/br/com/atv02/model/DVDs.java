package br.com.atv02.model;

public class DVDs extends Filme {
	private boolean arranhado;

	public DVDs() {
		// TODO Auto-generated constructor stub
	}

	public DVDs(boolean arranhado) {
		super();
		this.arranhado = arranhado;
	}

	public boolean isArranhado() {
		return arranhado;
	}

	public void setArranhado(boolean arranhado) {
		this.arranhado = arranhado;
	}
	
	public double calcularDiario(){
		return 10;
	}
	
	@Override
	public String toString() {
		return "DVDs [arranhado=" + arranhado + "]";
	}

}
