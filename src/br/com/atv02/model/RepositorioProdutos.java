package br.com.atv02.model;

import java.util.HashMap;
import java.util.Map;

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
}
