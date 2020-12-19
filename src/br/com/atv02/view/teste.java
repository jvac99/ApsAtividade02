package br.com.atv02.view;

import br.com.atv02.model.Cliente;
import br.com.atv02.model.RepositorioPessoas;

public class teste {

	public static void main(String[] args) {
		RepositorioPessoas pessoas = new RepositorioPessoas();
		Cliente c = new Cliente();
		c.setMatricula(1);
		c.setNome("joão");
		c.setSexo('s');
		c.setEndereco("a");
		c.setIdade(21);
		pessoas.adicionar(c);
		Cliente s = (Cliente) pessoas.buscar(1);
		System.out.println(s);
		pessoas.remover(1);
	}
	
}
