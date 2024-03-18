package com.mycompany.gerenciabanco;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //bb testes
        dadosUsuario ddUser = new dadosUsuario();
        ddUser.pedirDados();

        //loop  para manter o usuário no programa até ele apertar em sair
        /*do {

        }while ();*/
    }

    //classe para receber os dados
    public static class dadosUsuario {
        Scanner scanner = new Scanner(System.in);

        private void pedirDados(){

            System.out.println("Nome: ");
            String nome = scanner.next();

            System.out.println("Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("idade: ");
            int idade = scanner.nextInt();

            System.out.println("CPF: ");
            int cpf = scanner.nextInt();
        }
    }
}