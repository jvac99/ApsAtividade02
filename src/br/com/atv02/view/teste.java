package br.com.atv02.view;

import br.com.atv02.model.Cliente;
import br.com.atv02.model.RepositorioLocacoes;
import br.com.atv02.model.RepositorioPessoas;
import br.com.atv02.model.RepositorioProdutos;

public class teste {

	public static void main(String[] args) {
		RepositorioPessoas repositorioPessoasCliente = new RepositorioPessoas();
		RepositorioPessoas repositorioPessoasGerente = new RepositorioPessoas();
		RepositorioPessoas repositorioPessoasOperador = new RepositorioPessoas();
		RepositorioLocacoes repositorioLocacoes = new RepositorioLocacoes();
		RepositorioProdutos repositorioProdutos = new RepositorioProdutos();
		Cliente c = new Cliente();
		c.setMatricula(1);
		c.setNome("joão");
		c.setSexo('s');
		c.setEndereco("a");
		c.setIdade(21);
	}

}
