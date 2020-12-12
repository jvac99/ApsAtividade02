package br.com.atv02.model;

public abstract class Filme {
	private int anoLancamento, duracao;

	public Filme() {
		// TODO Auto-generated constructor stub
	}

	public Filme(int anoLancamento, int duracao) {
		super();
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Filme [anoLancamento=" + anoLancamento + ", duracao=" + duracao + "]";
	}

}
