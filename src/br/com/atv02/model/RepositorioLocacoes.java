package br.com.atv02.model;

import java.util.ArrayList;
import java.util.List;

public class RepositorioLocacoes {
	List<Locacoes> locacoes = new ArrayList<Locacoes>();

	public RepositorioLocacoes() {
		// TODO Auto-generated constructor stub
	}

	public void adicionar(Locacoes loca) {
		locacoes.add(loca);
		System.out.println(loca);

	}

	
}
