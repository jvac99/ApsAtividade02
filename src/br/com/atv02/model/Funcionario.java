package br.com.atv02.model;

public class Funcionario extends Pessoa {
	String login, senha;

	public Funcionario() {
		
	}

	public Funcionario(String nome, int matricula, String login, String senha) {
		super(nome, matricula);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Funcionario [login=" + login + ", senha=" + senha + ", nome=" + nome + ", matricula=" + matricula + "]";
	}
}
