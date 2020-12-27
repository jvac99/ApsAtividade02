package br.com.atv02.model;

public class DVDs extends Filme {
	private boolean arranhado;

	public DVDs() {
		
	}

	public DVDs(String codigo, String titulo, String genero, int anoLancamento, int duracao, boolean arranhado) {
		super(codigo, titulo, genero, anoLancamento, duracao);
		this.arranhado = arranhado;
	}

	public boolean isArranhado() {
		return arranhado;
	}

	public void setArranhado(boolean arranhado) {
		this.arranhado = arranhado;
	}
	
	public double calcularDiaria(){
		return 10;
	}
	
	@Override
	public String toString() {
		return "DVDs [arranhado=" + arranhado + "]";
	}

}
