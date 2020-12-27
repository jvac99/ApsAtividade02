package br.com.atv02.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.atv02.model.Pessoa;

public class RepositorioPessoas {
	Map<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();

	public RepositorioPessoas() {

	}

	public void adicionar(Pessoa pessoa) {
		pessoas.put(pessoa.getMatricula(), pessoa);
		System.out.println(pessoas);

	}

	public Pessoa buscar(int matricula) {
		return pessoas.get(matricula);
	}

	public void remover(int matricula) {
		System.out.println("Removido: " + pessoas.remove(matricula));
	}

	public void listar() {
		for (Pessoa pessoa : pessoas.values()) {
			System.out.println("Matricula" + pessoa.getMatricula() + " Nome: " + pessoa.getNome());
		}
	}
}
