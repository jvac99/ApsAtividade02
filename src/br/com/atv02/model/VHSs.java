package br.com.atv02.model;

public class VHSs extends Filme {
	private boolean cores;

	public VHSs() {
		
	}

	public VHSs(String codigo, String titulo, String genero, int anoLancamento, int duracao, boolean cores) {
		super(codigo, titulo, genero, anoLancamento, duracao);
		this.cores = cores;
	}

	public boolean isCores() {
		return cores;
	}

	public void setCores(boolean cores) {
		this.cores = cores;
	}
	
	public double calcularDiaria(){
		return 5;
	}
	
	@Override
	public String toString() {
		return "VHSs [cores=" + cores + "]";
	}

}
