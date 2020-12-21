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

	public void fazerLocacao() {

	}

	public void fazerbaixaLocacao() {
		
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
