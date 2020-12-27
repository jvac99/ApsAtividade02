package br.com.atv02.dao;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import br.com.atv02.model.DVDs;
import br.com.atv02.model.Locacoes;
import br.com.atv02.model.Produto;

public class RepositorioLocacoes {
	List<Locacoes> locacoes = new ArrayList<Locacoes>();

	public RepositorioLocacoes() {
		
	}

	public void adicionar(Locacoes loca) {
		for(Locacoes loc : locacoes){
			if(loc.getCodigoProduto() == loca.getCodigoProduto()){
				System.out.println("Produto já está alugado");
				return;
			}
		}
		locacoes.add(loca);
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

	public void baixa(int matriculaCliente, String codigoProduto, Repositorios rp){
		for(Locacoes loc : locacoes){
			if(loc.getCodigoProduto() == codigoProduto && loc.getMatriculaCliente() == matriculaCliente){
				long diferencaEmDias = ChronoUnit.DAYS.between(loc.getDataSaida(), loc.getDataPrevistaEntrega());
				for(Produto prod : rp.getRepositorioProdutos().produtos.values()){
					if(prod.getCodigo() == codigoProduto){
						System.out.println("Valor das diárias: " + prod.calcularDiaria() * 2 + " Multa: " + ((diferencaEmDias - 2) * 2));
						return;
					}
				}
			}
		}
	}

}
