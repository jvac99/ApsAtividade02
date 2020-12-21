package br.com.atv02.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.atv02.model.Locacoes;

public class RepositorioLocacoes {
	List<Locacoes> locacoes = new ArrayList<Locacoes>();

	public RepositorioLocacoes() {
		// TODO Auto-generated constructor stub
	}

	public void adicionar(Locacoes loca) {
		locacoes.add(loca);
		System.out.println(loca);
	}

	public Locacoes buscar(int matriculaCliente, String codigoProduto) {
		for (int i = 0; i < locacoes.size(); i++) {
			if (locacoes.get(i).getCodigoProduto().equals(codigoProduto)
					&& locacoes.get(i).getMatriculaCliente() == matriculaCliente) {
				return locacoes.get(i);
			}
		}
		return null;
	}

	public void remover(int matriculaCliente, String codigoProduto) {
		for (int i = 0; i < locacoes.size(); i++) {
			if (locacoes.get(i).getCodigoProduto().equals(codigoProduto)
					&& locacoes.get(i).getMatriculaCliente() == matriculaCliente) {
				System.out.println("Removido: " + locacoes.remove(i));
				return;
			}
		}
		System.out.println("Valor não encontrado.");
	}

}
