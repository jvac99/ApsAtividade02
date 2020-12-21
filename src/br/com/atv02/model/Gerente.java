package br.com.atv02.model;

import br.com.atv02.dao.Repositorios;

public class Gerente extends Funcionario {
	Repositorios repositorios = null;

	public Gerente() {

	}

	public Gerente(Repositorios repositorios) {
		this.repositorios = repositorios;
	}

	public void adicionarCliente(Cliente cliente) {
		repositorios.getRepositorioPessoasCliente().adicionar(cliente);
	}

	public void adicionarProduto(Produto produto) {
		repositorios.getRepositorioProdutos().adicionar(produto);
	}

	public void adicionarOperador(OperadorDoSistema operador) {
		repositorios.getRepositorioPessoasOperador().adicionar(operador);
	}

	public void listarProdutos() {
		repositorios.getRepositorioProdutos().listar();
	}

	public void listarClientes() {
		repositorios.getRepositorioPessoasCliente().listar();
	}

	public void listarOperadores() {
		repositorios.getRepositorioPessoasOperador().listar();
	}

	public void procurarProduto(String codigo) {
		repositorios.getRepositorioProdutos().buscar(codigo);
	}

	public void procurarCliente(int matricula) {
		repositorios.getRepositorioPessoasCliente().buscar(matricula);
	}

	public void procurarOperador(int matricula) {
		repositorios.getRepositorioPessoasOperador().buscar(matricula);
	}
}
