package br.com.atv02.model;

public abstract class Pessoa {
	String nome;
	int matricula;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", matricula=" + matricula + "]";
	}

}
