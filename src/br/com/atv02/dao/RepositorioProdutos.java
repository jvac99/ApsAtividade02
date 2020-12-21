package br.com.atv02.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.atv02.model.Produto;

public class RepositorioProdutos {
	Map<String, Produto> produtos = new HashMap<String, Produto>();

	public RepositorioProdutos() {
		// TODO Auto-generated constructor stub
	}

	public void adicionar(Produto produto) {
		produtos.put(produto.getCodigo(), produto);
		System.out.println(produtos);

	}

	public Produto buscar(String codigo) {
		return produtos.get(codigo);
	}

	public void remover(String codigo) {
		System.out.println("Removido: " + produtos.remove(codigo));
	}

	public void listar() {
		System.out.print(produtos);
	}
}
