package com.mycompany.gerenciabanco;

import java.util.Scanner;

public class Main {


    public void main(String[] args) {

        //bb testes


        //loop  para manter o usuário no programa até ele apertar em sair
        System.out.println("Bem-Vindo ao Banco javasil");
        String encerrar;

        do {
            DadosUsuario dadosUser = new DadosUsuario();
            dadosUser.pedirDados();

            OperacoesBancarias operacoesBancarias = new OperacoesBancarias();


            System.out.println("Deseja encerrar: ");
            encerrar = dadosUser.scanner.next().toLowerCase();

        }while (encerrar != "sim");
    }

    //classe para receber os dados
    public static class DadosUsuario {
        public Scanner scanner = new Scanner(System.in);

        private void menu(){



        }

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

    public class OperacoesBancarias{

        double saldo;

        private void consultaSaldo(){

        }

        private void deposito(){

        }

        private void retirada(){

        }
    }
}