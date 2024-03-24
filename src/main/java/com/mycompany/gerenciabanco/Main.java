package com.mycompany.gerenciabanco;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //bb testes


        //loop  para manter o usuário no programa até ele apertar em sair
        System.out.println("Bem-Vindo ao Banco javasil");
        int encerrar;

        //pedirDados
        DadosUsuario dadosUser = new DadosUsuario();
        //dadosUser.pedirDados();
        dadosUser.menu();

        do {




            encerrar = dadosUser.scanner.nextInt();

        }while (encerrar != 0);
    }

    //classe para receber os dados
    public static class DadosUsuario {
        public Scanner scanner = new Scanner(System.in);
        OperacoesBancarias deposito = new OperacoesBancarias();

        private void menu(){

            System.out.println("O que deseja: ");
            System.out.println("""
                    [1] Depositar
                    [2] Sacar
                    [3] Saldo
                    [0] Encerrar
                              \s
                    """
            );
            int opcao = scanner.nextInt();
            switch (opcao){

                case 1:
                    deposito.deposito();
                    System.out.println("Deposito realizado com Sucesso.");
                    break;
                case 2:
                    deposito.retirada();
                    System.out.println("Operação realizada com Sucesso.");
                    break;
                case 3:
                    System.out.println("Saldo: R$" + deposito.consultaSaldo());
                    break;
            }
            menu();

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

    public static class OperacoesBancarias{

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        private double consultaSaldo(){
            return saldo;
        }

        private double deposito(){
            System.out.println("valor: R$");
            double valor = scanner.nextDouble();
            saldo += valor;

            return saldo;
        }

        private double retirada(){
            System.out.println("valor: R$");
            double retirada = scanner.nextDouble();
            if (retirada >= saldo){
                System.out.println("""
                        Saldo insufuciênte\s
                        Você tem disponivel: R$\s
                        """ + saldo
                );
            }
            return saldo -= retirada;

        }
    }
}