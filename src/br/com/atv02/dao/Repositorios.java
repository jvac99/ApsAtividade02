package br.com.atv02.dao;

import br.com.atv02.model.Gerente;
import br.com.atv02.model.OperadorDoSistema;

public class Repositorios {
	private RepositorioPessoas repositorioPessoasCliente = new RepositorioPessoas();
	private RepositorioPessoas repositorioPessoasOperador = new RepositorioPessoas();
	private RepositorioLocacoes repositorioLocacoes = new RepositorioLocacoes();
	private RepositorioProdutos repositorioProdutos = new RepositorioProdutos();
	private Gerente gerente = null;
	private OperadorDoSistema operadorDoSistema = null;

	public Repositorios() {
		setGerente(new Gerente("Neo", 1, "admin", "admin", this));
	}

	public RepositorioPessoas getRepositorioPessoasCliente() {
		return repositorioPessoasCliente;
	}

	public RepositorioPessoas getRepositorioPessoasOperador() {
		return repositorioPessoasOperador;
	}

	public RepositorioLocacoes getRepositorioLocacoes() {
		return repositorioLocacoes;
	}

	public RepositorioProdutos getRepositorioProdutos() {
		return repositorioProdutos;
	}

	public void setRepositorioPessoasCliente(RepositorioPessoas repositorioPessoasCliente) {
		this.repositorioPessoasCliente = repositorioPessoasCliente;
	}

	public void setRepositorioPessoasOperador(RepositorioPessoas repositorioPessoasOperador) {
		this.repositorioPessoasOperador = repositorioPessoasOperador;
	}

	public void setRepositorioLocacoes(RepositorioLocacoes repositorioLocacoes) {
		this.repositorioLocacoes = repositorioLocacoes;
	}

	public void setRepositorioProdutos(RepositorioProdutos repositorioProdutos) {
		this.repositorioProdutos = repositorioProdutos;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public OperadorDoSistema getOperadorDoSistema() {
		return operadorDoSistema;
	}

	public void setOperadorDoSistema(OperadorDoSistema operadorDoSistema) {
		this.operadorDoSistema = operadorDoSistema;
	}
}
