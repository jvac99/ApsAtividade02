package br.com.atv02.model;

import br.com.atv02.dao.Repositorios;

public class OperadorDoSistema extends Funcionario {
	Repositorios repositorios = null;
	Produto produto = null;
	Cliente cliente = null;
	OperadorDoSistema operadorDoSistema = null;

	public OperadorDoSistema() {

	}

	public OperadorDoSistema(Repositorios repositorios) {
		this.repositorios = repositorios;
	}

	public void fazerLocacao(int matriculaCliente, String codigoProduto) {
		Locacoes locacoes = new Locacoes(codigoProduto, matricula);
		repositorios.getRepositorioLocacoes().adicionar(locacoes);
		produto = repositorios.getRepositorioProdutos().buscar(codigoProduto);
		produto.setLocado(true);
		repositorios.getRepositorioProdutos().alterar(codigoProduto, produto);
	}

	public void fazerbaixaLocacao(int matriculaCliente, String codigoProduto) {
		repositorios.getRepositorioLocacoes().remover(matriculaCliente, codigoProduto);
		produto = repositorios.getRepositorioProdutos().buscar(codigoProduto);
		Double diaria = produto.calcularDiaria();
		produto.setLocado(false);
		repositorios.getRepositorioProdutos().alterar(codigoProduto, produto);
		System.out.println(diaria);
	}

	public void excluirLocacao(int matriculaCliente, String codigoProduto) {
		repositorios.getRepositorioLocacoes().remover(matriculaCliente, codigoProduto);
	}

	public void procurarProduto(String codigo) {
		produto = repositorios.getRepositorioProdutos().buscar(codigo);
		System.out.print(produto);
	}

	public void procurarCliente(int matricula) {
		cliente = (Cliente) repositorios.getRepositorioPessoasCliente().buscar(matricula);
		System.out.println(cliente);
	}
}
