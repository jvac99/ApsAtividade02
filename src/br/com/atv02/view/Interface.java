package br.com.atv02.view;

import java.util.Scanner;
import br.com.atv02.dao.Repositorios;

class Options{
    Scanner scanner = new Scanner(System.in);    
    int perfil;

    public void selectPerfil(){
        while(true){
            System.out.println("****Bem-vindo, escolha um perfil abaixo:");
            System.out.println("1 - Gerente");
            System.out.println("2 - Operador de Sistema");
            System.out.println("3 - Sair");
            try{
                perfil = Integer.parseInt(scanner.nextLine());

                if(perfil > 0 && perfil < 4){
                    if(perfil == 3){
                        System.exit(0);
                    }else{
                        break;
                    }
                }else{
                    System.out.println("Número inválido");
                }
            }catch(NumberFormatException exception){
                System.out.println("Entrada inválida");
            }
        }
    }
    public int Logar(){
        while(true){
            String user, senha;
            System.out.println("****Faça seu Login****");
            System.out.print("Digite seu login: ");
            user = scanner.nextLine();
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();
            
            if(user.equals("admin") && senha.equals("admin") && perfil == 1){
                break;
            }else if(perfil == 2){

            }else{
                System.out.println("Usuário ou senha incorretos");
            }
        }
        return perfil;
    }
}


public class Interface {
    public static void main(String args[]){
        Options op = new Options();
        Repositorios rp = new Repositorios();
        op.selectPerfil();

        if(op.Logar() == 1){
            MenuGerente mGerente = new MenuGerente(rp);
            mGerente.menu();
        }else{
            MenuOperador mOperador = new MenuOperador(rp);
            mOperador.menu();
        }
    }
}
