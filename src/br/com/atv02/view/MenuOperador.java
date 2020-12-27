package br.com.atv02.view;

import java.util.*;

import br.com.atv02.dao.Repositorios;
import br.com.atv02.model.Locacoes;

public class MenuOperador {
    Scanner scanner = new Scanner(System.in);
    Repositorios rp = null;

    MenuOperador(Repositorios rp){
        this.rp = rp;
    }
    public void menu(){
        while(true){
            System.out.println("****Olá Operador****");
            System.out.println("1 – Fazer locação");
            System.out.println("2 – Dar baixa em locação");
            System.out.println("3 – Excluir locação");
            System.out.println("4 – Procurar Produto");
            System.out.println("5 – Procurar Cliente");
            System.out.println("6 – Sair");

            try{
                int idOP = Integer.parseInt(scanner.nextLine());
                String line;
                String cmd[];
                if(idOP == 1){
                    line = scanner.nextLine();
                    cmd = line.split(" ");
                    rp.getRepositorioLocacoes().adicionar(new Locacoes(cmd[0], Integer.parseInt(cmd[1])));
                }else if(idOP == 2){
                    line = scanner.nextLine();
                    cmd = line.split(" ");
                    rp.getRepositorioLocacoes().baixa(Integer.parseInt(cmd[0]), cmd[1], rp);
                }else if(idOP == 3){
                    line = scanner.nextLine();
                    cmd = line.split(" ");
                    rp.getRepositorioLocacoes().remover(Integer.parseInt(cmd[0]), cmd[1]);
                }else if(idOP == 4){
                    line = scanner.nextLine();
                    rp.getRepositorioProdutos().buscar(line);
                }else if(idOP == 5){
                    line = scanner.nextLine();
                    rp.getRepositorioPessoasCliente().buscar(Integer.parseInt(line));
                }else if(idOP == 6){
                    System.exit(0);
                }else{
                    System.out.println("Operação inválida");
                }
            }catch(NumberFormatException exception){
                System.out.println("Formato inválido");
            }
        }
    }
}
