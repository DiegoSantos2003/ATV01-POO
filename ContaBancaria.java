package model;
import java.util.Scanner;

public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;

    // Construtor
    public ContaBancaria(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void realizaDeposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    // Método para realizar saque
    public void realizaSaque(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira os dados da conta bancária
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha pendente

        System.out.print("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        // Criando um objeto ContaBancaria com os dados fornecidos pelo usuário
        ContaBancaria conta = new ContaBancaria(numeroConta, nome, saldoInicial);

        // Exibindo as opções de operações
        System.out.println("\nOpções:");
        System.out.println("1. Realizar depósito");
        System.out.println("2. Realizar saque");
        System.out.println("0. Sair");

        int opcao;
        do {
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.realizaDeposito(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    conta.realizaSaque(valorSaque);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}