package br.com.atv02.view;

import java.util.Scanner;

import br.com.atv02.dao.Repositorios;
import br.com.atv02.model.Blurays;
import br.com.atv02.model.CDs;
import br.com.atv02.model.Cliente;
import br.com.atv02.model.DVDs;
import br.com.atv02.model.Gerente;
import br.com.atv02.model.LPs;
import br.com.atv02.model.OperadorDoSistema;
import br.com.atv02.model.Produto;
import br.com.atv02.model.VHSs;

public class MenuGerente {
	Scanner scanner = new Scanner(System.in);
	Repositorios rp = null;

	MenuGerente(Repositorios rp) {
		this.rp = rp;
	}

	public void menu() {
		Gerente gerente = rp.getGerente();
		while (true) {
			System.out.println("****Olá " + gerente.getNome() + "*****");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Cadastrar Cliente");
			System.out.println("3 - Cadastrar Operador");
			System.out.println("4 - Listar Produtos");
			System.out.println("5 - Listar Clientes");
			System.out.println("6 - Listar Operadores");
			System.out.println("7 - Procurar Produto");
			System.out.println("8 - Procurar Cliente");
			System.out.println("9 - Procurar Operador");
			System.out.println("10 - Voltar a tela de login");
			System.out.println("11 - Sair");

			try {
				int idOP = scanner.nextInt();
				if (idOP == 1) {
					System.out.println("Qual o produto?");
					System.out.println("1 DVD");
					System.out.println("2 VHS");
					System.out.println("3 Bluray");
					System.out.println("4 CD");
					System.out.println("5 LP");
					int opcPro = scanner.nextInt();
					Produto prod = null;
					String codigo, titulo, genero, idioma1, idioma2 = null, autor;
					int arranhado, cores, duplo, numFaixas, raro;
					int anoLancamento, duracao;
					if (opcPro == 1) {
						System.out.println("Digite o código: ");
						codigo = scanner.next();
						System.out.println("Digite o título: ");
						titulo = scanner.next();
						System.out.println("Digite o gênero: ");
						genero = scanner.next();
						System.out.println("Digite o ano de lançamento: ");
						anoLancamento = scanner.nextInt();
						System.out.println("Digite a duração: ");
						duracao = scanner.nextInt();
						System.out.println("Digite 1 se está arranhado, 0 caso não: ");
						arranhado = scanner.nextInt();
						prod = new DVDs(codigo, titulo, genero, anoLancamento, duracao, arranhado == 1);
					} else if (opcPro == 2) {
						System.out.println("Digite o código: ");
						codigo = scanner.next();
						System.out.println("Digite o título: ");
						titulo = scanner.next();
						System.out.println("Digite o gênero: ");
						genero = scanner.next();
						System.out.println("Digite o ano de lançamento: ");
						anoLancamento = scanner.nextInt();
						System.out.println("Digite a duração: ");
						duracao = scanner.nextInt();
						System.out.println("Digite 1 se é colorido, 0 caso não: ");
						cores = scanner.nextInt();
						prod = new VHSs(codigo, titulo, genero, anoLancamento, duracao, cores == 1);
					} else if (opcPro == 3) {
						System.out.println("Digite o código: ");
						codigo = scanner.next();
						System.out.println("Digite o título: ");
						titulo = scanner.next();
						System.out.println("Digite o gênero: ");
						genero = scanner.next();
						System.out.println("Digite o ano de lançamento: ");
						anoLancamento = scanner.nextInt();
						System.out.println("Digite a duração: ");
						duracao = scanner.nextInt();
						System.out.println("Digite o primeiro idioma: ");
						idioma1 = scanner.next();
						System.out.println("Se tem um segundo idioma, digite 1, caso não 0: ");
						int i = scanner.nextInt();
						if (i == 1) {
							System.out.println("Digite o segundo idioma: ");
							idioma2 = scanner.next();
						}
						prod = new Blurays(codigo, titulo, genero, anoLancamento, duracao, idioma1, idioma2);
					} else if (opcPro == 4) {
						System.out.println("Digite o código: ");
						codigo = scanner.next();
						System.out.println("Digite o título: ");
						titulo = scanner.next();
						System.out.println("Digite o gênero: ");
						genero = scanner.next();
						System.out.println("Digite o autor: ");
						autor = scanner.next();
						System.out.println("Digite o número de faixas: ");
						numFaixas = scanner.nextInt();
						System.out.println("Digite 1 se está arranhado, 0 caso não: ");
						arranhado = scanner.nextInt();
						System.out.println("Digite 1 se ele é duplo, 0 caso não: ");
						duplo = scanner.nextInt();
						prod = new CDs(codigo, titulo, genero, autor, numFaixas, arranhado == 1, duplo == 1);
					} else if (opcPro == 5) {
						System.out.println("Digite o código: ");
						codigo = scanner.next();
						System.out.println("Digite o título: ");
						titulo = scanner.next();
						System.out.println("Digite o gênero: ");
						genero = scanner.next();
						System.out.println("Digite o autor: ");
						autor = scanner.next();
						System.out.println("Digite o número de faixas: ");
						numFaixas = scanner.nextInt();
						System.out.println("Digite 1 se está arranhado, 0 caso não: ");
						arranhado = scanner.nextInt();
						System.out.println("Digite 1 se ele é duplo, 0 caso não: ");
						duplo = scanner.nextInt();
						System.out.println("Digite 1 se ele é raro, 0 caso não: ");
						raro = scanner.nextInt();
						prod = new LPs(codigo, titulo, genero, autor, numFaixas, raro == 1);
					}
					gerente.adicionarProduto(prod);
				} else if (idOP == 2) {
					System.out.println("Digite o nome do cliente: ");
					String nome = scanner.next();
					System.out.println("Digite a matricula: ");
					int matricula = scanner.nextInt();
					System.out.println("Digite o endereço do cliente: ");
					String endereco = scanner.next();
					System.out.println("Digite a idade do cliente: ");
					int idade = scanner.nextInt();
					System.out.println("Digite o sexo do cliente: h = homem, m = mulher ou o = outro");
					String sexo = scanner.next();
					gerente.adicionarCliente(new Cliente(nome, matricula, endereco, idade, sexo.charAt(0)));
				} else if (idOP == 3) {
					System.out.println("Digite o nome do operador: ");
					String nome = scanner.next();
					System.out.println("Digite a matricula: ");
					int matricula = scanner.nextInt();
					System.out.println("Digite o login do operador: ");
					String login = scanner.next();
					System.out.println("Digite a senha do operador: ");
					String senha = scanner.next();
					gerente.adicionarOperador(new OperadorDoSistema(nome, matricula, login, senha, rp));
				} else if (idOP == 4) {
					rp.getRepositorioProdutos().listar();
				} else if (idOP == 5) {
					rp.getRepositorioPessoasCliente().listar();
				} else if (idOP == 6) {
					rp.getRepositorioPessoasOperador().listar();
				} else if (idOP == 7) {
					System.out.println("Digite o código: ");
					String codigo = scanner.next();
					gerente.procurarProduto(codigo);
				} else if (idOP == 8) {
					System.out.println("Digite a matricula: ");
					int matricula = scanner.nextInt();
					gerente.procurarCliente(matricula);
				} else if (idOP == 9) {
					System.out.println("Digite a matricula: ");
					int matricula = scanner.nextInt();
					gerente.procurarOperador(matricula);
				} else if (idOP == 10) {
					Interface i = new Interface();
					i.tela1(rp);
				} else if (idOP == 11) {
					System.exit(0);
				} else {
					System.out.println("Operação inválida");
				}
			} catch (NumberFormatException exception) {
				System.out.println("Formato inválido" + exception);
			}
		}
	}
}
