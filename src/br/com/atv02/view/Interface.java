package br.com.atv02.view;

import java.util.Scanner;

public class Interface {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int perfil;
        while(true){
            perfil = Integer.parseInt(scanner.nextLine());
            System.out.println("****Bem-vindo, escolha um perfil abaixo:");
            System.out.println("1 - Gerente");
            System.out.println("2 - Operador de Sistema");
            System.out.println("3 - Sair");

            if(perfil > 0 && perfil < 4){

                break;
            }else{
                System.out.println("Número inválido");
            }
        }
    }
}
