package br.com.atv02.model;

import br.com.atv02.dao.Repositorios;

public class Gerente extends Funcionario {
	Repositorios repositorios = null;
	Produto produto = null;
	Cliente cliente = null;
	OperadorDoSistema operadorDoSistema = null;

	public Gerente() {

	}

	public Gerente(String nome, int matricula, String login, String senha, Repositorios repositorios) {
		super(nome, matricula, login, senha);
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
		produto = repositorios.getRepositorioProdutos().buscar(codigo);
		System.out.print(produto);
	}

	public void procurarCliente(int matricula) {
		cliente = (Cliente) repositorios.getRepositorioPessoasCliente().buscar(matricula);
		System.out.println(cliente);
	}

	public void procurarOperador(int matricula) {
		operadorDoSistema = (OperadorDoSistema) repositorios.getRepositorioPessoasOperador().buscar(matricula);
		System.out.println(operadorDoSistema);
	}
}
