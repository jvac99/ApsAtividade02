package br.com.atv02.model;

public class Cliente extends Pessoa {
	String endereco;
	int idade;
	char sexo;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String endereco, int idade, char sexo) {
		super();
		this.endereco = endereco;
		this.idade = idade;
		this.sexo = sexo;
	}

	public Cliente(String nome, int matricula, String endereco, int idade, char sexo) {
		super(nome, matricula);
		this.endereco = endereco;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public int getIdade() {
		return idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", idade=" + idade + ", sexo=" + sexo + ", nome=" + nome
				+ ", matricula=" + matricula + "]";
	}

}
