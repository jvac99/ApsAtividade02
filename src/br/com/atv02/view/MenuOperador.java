package br.com.atv02.view;

import java.util.Scanner;

import br.com.atv02.dao.Repositorios;
import br.com.atv02.model.OperadorDoSistema;

public class MenuOperador {
	Scanner scanner = new Scanner(System.in);
	Repositorios rp = null;
	OperadorDoSistema ops = null;

	MenuOperador(Repositorios rp) {
		this.rp = rp;
	}

	public void menu() {
		ops = rp.getOperadorDoSistema();
		while (true) {
			System.out.println("****Olá " + ops.getNome() + "****");
			System.out.println("1 - Fazer locação");
			System.out.println("2 - Dar baixa em locação");
			System.out.println("3 - Excluir locação");
			System.out.println("4 - Procurar Produto");
			System.out.println("5 - Procurar Cliente");
			System.out.println("6 - Voltar a tela de login");
			System.out.println("7 - Sair");

			try {
				int idOP = scanner.nextInt();
				if (idOP == 1) {
					System.out.println("Digite a matricula do cliente: ");
					int matriculaCliente = scanner.nextInt();
					System.out.println("Digite o código do produto: ");
					String codigoProduto = scanner.next();
					ops.fazerLocacao(matriculaCliente, codigoProduto);
				} else if (idOP == 2) {
					System.out.println("Digite a matricula do cliente: ");
					int matriculaCliente = scanner.nextInt();
					System.out.println("Digite o código do produto: ");
					String codigoProduto = scanner.next();
					ops.fazerbaixaLocacao(matriculaCliente, codigoProduto);
				} else if (idOP == 3) {
					System.out.println("Digite a matricula do cliente: ");
					int matriculaCliente = scanner.nextInt();
					System.out.println("Digite o código do produto: ");
					String codigoProduto = scanner.next();
					ops.excluirLocacao(matriculaCliente, codigoProduto);
				} else if (idOP == 4) {
					System.out.println("Digite o código: ");
					String codigo = scanner.next();
					ops.procurarProduto(codigo);
				} else if (idOP == 5) {
					System.out.println("Digite a matricula: ");
					int matricula = scanner.nextInt();
					ops.procurarCliente(matricula);
				} else if (idOP == 6) {
					Interface i = new Interface();
					i.tela1(rp);
				} else if (idOP == 7) {
					System.exit(0);
				} else {
					System.out.println("Operação inválida");
				}
			} catch (NumberFormatException exception) {
				System.out.println("Formato inválido");
			}
		}
	}
}
