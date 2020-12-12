package br.com.atv02.model;

public class VHSs extends Filme {
	private boolean cores;

	public VHSs() {
		// TODO Auto-generated constructor stub
	}

	public VHSs(boolean cores) {
		super();
		this.cores = cores;
	}

	public boolean isCores() {
		return cores;
	}

	public void setCores(boolean cores) {
		this.cores = cores;
	}

	@Override
	public String toString() {
		return "VHSs [cores=" + cores + "]";
	}

}
