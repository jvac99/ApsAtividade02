package br.com.atv02.view;

import java.util.List;
import java.util.Scanner;

import br.com.atv02.dao.Repositorios;
import br.com.atv02.model.Gerente;
import br.com.atv02.model.OperadorDoSistema;
import br.com.atv02.model.Pessoa;

class Options {
	Repositorios repositorios = null;
	OperadorDoSistema ops = null;
	Scanner scanner = new Scanner(System.in);
	int perfil;

	public Options(Repositorios rp) {
		repositorios = rp;
	}

	public void selectPerfil() {
		while (true) {
			System.out.println("****Bem-vindo, escolha um perfil abaixo:");
			System.out.println("1 - Gerente");
			System.out.println("2 - Operador de Sistema");
			System.out.println("3 - Sair");
			try {
				perfil = Integer.parseInt(scanner.nextLine());

				if (perfil > 0 && perfil < 4) {
					if (perfil == 3) {
						System.exit(0);
					} else {
						break;
					}
				} else {
					System.out.println("Número inválido.");
				}
			} catch (NumberFormatException exception) {
				System.out.println("Entrada inválida.");
			}
		}
	}

	public int Logar() {
		int cont = 5;
		while (true) {
			if (cont == 0) {
				System.out.println("Excedeu o limite de tentativas.");
				selectPerfil();
			}
			cont--;
			String user, senha;
			System.out.println("****Faça seu Login****");
			System.out.print("Digite seu login: ");
			user = scanner.nextLine();
			System.out.print("Digite sua senha: ");
			senha = scanner.nextLine();

			if (perfil == 1) {
				Gerente gerente = repositorios.getGerente();
				if (user.equals(gerente.getLogin()) && senha.equals(gerente.getSenha())) {
					break;
				} else {
					System.out.println("Usuário ou senha incorretos");
				}
			} else {
				List<Pessoa> p = repositorios.getRepositorioPessoasOperador().listarTodos();
				if (p == null) {
					System.out.println("Não existe nenhum operador de sistemas.");
					selectPerfil();
				} else {
					OperadorDoSistema ops = null;
					for (int i = 0; i < p.size(); i++) {
						ops = (OperadorDoSistema) p.get(i);
						if (user.equals(ops.getLogin()) && senha.equals(ops.getSenha())) {
							repositorios.setOperadorDoSistema(ops);
							return perfil;
						}
					}
					System.out.println("Usuário ou senha incorretos");
				}
			}
		}
		return perfil;
	}
}

public class Interface {

	public static void main(String args[]) {
		Repositorios rp = new Repositorios();
		Options op = new Options(rp);
		op.selectPerfil();

		if (op.Logar() == 1) {
			MenuGerente mGerente = new MenuGerente(rp);
			mGerente.menu();
		} else {
			MenuOperador mOperador = new MenuOperador(rp);
			mOperador.menu();
		}
	}

	public void tela1(Repositorios rp) {
		Options op = new Options(rp);
		op.selectPerfil();

		if (op.Logar() == 1) {
			MenuGerente mGerente = new MenuGerente(rp);
			mGerente.menu();
		} else {
			MenuOperador mOperador = new MenuOperador(rp);
			mOperador.menu();
		}
	}
}
