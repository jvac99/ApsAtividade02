package br.com.atv02.view;
import java.util.Scanner;
import br.com.atv02.dao.Repositorios;
import br.com.atv02.model.Produto;
import br.com.atv02.model.DVDs;
import br.com.atv02.model.VHSs;
import br.com.atv02.model.Blurays;
import br.com.atv02.model.LPs;
import br.com.atv02.model.OperadorDoSistema;
import br.com.atv02.model.CDs;
import br.com.atv02.model.Cliente;

public class MenuGerente{
    Scanner scanner = new Scanner(System.in);
    Repositorios rp = null;

    MenuGerente(Repositorios rp){
        this.rp = rp;
    }    
    public void menu(){
        while(true){
            System.out.println("****Olá Gerente*****");
            System.out.println("1 – Cadastrar Produto");
            System.out.println("2 – Cadastrar Cliente");
            System.out.println("3 – Cadastrar Operador");
            System.out.println("4 – Listar Produtos");
            System.out.println("5 – Listar Clientes");
            System.out.println("6 – Listar Operadores");
            System.out.println("7 – Procurar Produto");
            System.out.println("8 – Procurar Cliente");
            System.out.println("9 – Procurar Operador");
            System.out.println("10 – Sair");

            try{
                int idOP = Integer.parseInt(scanner.nextLine());
                String line;
                String cmd[];
                if(idOP == 1){
                    line = scanner.nextLine();
                    cmd = line.split(" ");
                    Produto prod = null;
                    if(cmd[0].equals("DVD")){
                        prod = new DVDs(cmd[1], cmd[2], cmd[3], Integer.parseInt(cmd[4]), Integer.parseInt(cmd[5]), false);
                    }else if(cmd[0].equals("VHS")){
                        boolean colorido = false;
                        if(cmd[6].equals("sim")){
                            colorido = true;
                        }
                        prod = new VHSs(cmd[1], cmd[2], cmd[3], Integer.parseInt(cmd[4]), Integer.parseInt(cmd[5]), colorido);
                    }else if(cmd[0].equals("Bluray")){
                        prod = new Blurays(cmd[1], cmd[2], cmd[3], Integer.parseInt(cmd[4]), Integer.parseInt(cmd[5]), cmd[6], cmd[7]);
                    }else if(cmd[0].equals("LP")){
                        boolean raro = false;
                        if(cmd[6].equals("sim")){
                            raro = true;
                        }
                        prod = new LPs(cmd[1], cmd[2], cmd[3], cmd[4], Integer.parseInt(cmd[5]), raro);
                    }else if(cmd[0].equals("CD")){
                        boolean arranhado = false, duplo = false;
                        if(cmd[6].equals("sim")){
                            arranhado = true;
                        }
                        if(cmd[7].equals("sim")){
                            duplo = true;
                        }
                        prod = new CDs(cmd[1], cmd[2], cmd[3], cmd[4], Integer.parseInt(cmd[5]), arranhado, duplo);
                    }
                    rp.getRepositorioProdutos().adicionar(prod);
                }else if(idOP == 2){
                    line = scanner.nextLine();
                    cmd = line.split(" ");
                    rp.getRepositorioPessoasCliente().adicionar(new Cliente(cmd[0], Integer.parseInt(cmd[1]), cmd[2], Integer.parseInt(cmd[3]), cmd[4].charAt(0)));
                }else if(idOP == 3){
                    line = scanner.nextLine();
                    cmd = line.split(" ");
                    rp.getRepositorioPessoasOperador().adicionar(new OperadorDoSistema(cmd[0], Integer.parseInt(cmd[1]), cmd[2], cmd[3], rp));
                }else if(idOP == 4){
                    rp.getRepositorioProdutos().listar();
                }else if(idOP == 5){
                    rp.getRepositorioPessoasCliente().listar();
                }else if(idOP == 6){
                    rp.getRepositorioPessoasOperador().listar();
                }else if(idOP == 7){
                    line = scanner.nextLine();
                    rp.getRepositorioProdutos().buscar(line);
                }else if(idOP == 8){
                    line = scanner.nextLine();
                    rp.getRepositorioPessoasCliente().buscar(Integer.parseInt(line));
                }else if(idOP == 9){
                    line = scanner.nextLine();
                    rp.getRepositorioPessoasOperador().buscar(Integer.parseInt(line));
                }else if(idOP == 10){
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
