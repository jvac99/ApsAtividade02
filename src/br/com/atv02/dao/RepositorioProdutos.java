package br.com.atv02.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.atv02.model.Produto;

public class RepositorioProdutos {
	Map<String, Produto> produtos = new HashMap<String, Produto>();

	public RepositorioProdutos() {
		
	}

	public void adicionar(Produto produto) {
		produtos.put(produto.getCodigo(), produto);
		System.out.println("Adicionado");
	}

	public void alterar(String codigo, Produto produto) {
		produtos.replace(codigo, produto);
	}

	public Produto buscar(String codigo) {
		return produtos.get(codigo);
	}

	public void remover(String codigo) {
		System.out.println("Removido: " + produtos.remove(codigo));
	}

	public void listar() {
		for (Produto produto : produtos.values()) {
			System.out.println("Código: " + produto.getCodigo() + " Titulo: " + produto.getTitulo() + " Gênero: " + produto.getGenero());
		}
	}
}
