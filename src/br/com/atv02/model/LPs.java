package br.com.atv02.model;

public class LPs extends Musica {
	private boolean raro;

	public LPs() {
		// TODO Auto-generated constructor stub
	}

	public LPs(boolean raro) {
		super();
		this.raro = raro;
	}

	public boolean isRaro() {
		return raro;
	}

	public void setRaro(boolean raro) {
		this.raro = raro;
	}

	public double calcularDiaria(){
		return 20;
	}
	
	@Override
	public String toString() {
		return "LPs [raro=" + raro + "]";
	}

}
