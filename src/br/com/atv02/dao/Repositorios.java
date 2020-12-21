package br.com.atv02.dao;

public class Repositorios {
	private RepositorioPessoas repositorioPessoasCliente = new RepositorioPessoas();
	private RepositorioPessoas repositorioPessoasGerente = new RepositorioPessoas();
	private RepositorioPessoas repositorioPessoasOperador = new RepositorioPessoas();
	private RepositorioLocacoes repositorioLocacoes = new RepositorioLocacoes();
	private RepositorioProdutos repositorioProdutos = new RepositorioProdutos();

	public RepositorioPessoas getRepositorioPessoasCliente() {
		return repositorioPessoasCliente;
	}

	public RepositorioPessoas getRepositorioPessoasGerente() {
		return repositorioPessoasGerente;
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

	public void setRepositorioPessoasGerente(RepositorioPessoas repositorioPessoasGerente) {
		this.repositorioPessoasGerente = repositorioPessoasGerente;
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
}
