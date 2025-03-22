package rbs_banc.app;

import java.util.Scanner;

import rbs_banc.model.ContaBancaria;

public class MainBank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Solicitando o saldo inicial ao usuário
		System.out.print("Digite o saldo inicial para abrir a conta: ");
        double saldoInicial = scan.nextDouble();
		
        // Criando uma conta bancária com saldo inicial e limite de cheque especial proporcional
		ContaBancaria contaBancaria = new ContaBancaria(saldoInicial);

		int opcao;
		do {
			MainBank.menu();
			
			// Lendo a opção do usuário
			opcao = scan.nextInt();

			// Processando a opção escolhida
			switch (opcao) {
			case 1:
				contaBancaria.consultarSaldo();
				break;
			case 2:
				contaBancaria.consultarSaldo();
				break;
			case 3:
				System.out.print("Digite o valor a ser depositado: ");
				double valorDeposito = scan.nextDouble();
				contaBancaria.depositar(valorDeposito);
				break;
			case 4:
				System.out.println("Digite o valor a ser sacado: ");
				double valorSaque = scan.nextDouble();
				contaBancaria.sacar(valorSaque);
				break;
			case 5:
				System.out.print("Digite o valor do boleto a ser pago: ");
				double valorBoleto = scan.nextDouble();
				contaBancaria.pagarBoleto(valorBoleto);
				break;
			case 6:
				contaBancaria.verificarUsoChequeEspecial();
				break;
			case 0:
				System.out.println("Saindo do sistema. Até logo!");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 0);

		// Fechando o scanner
		scan.close();
	}

	private static void menu() {
		System.out.println("\n=== MENU DA CONTA BANCÁRIA ===");
		System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar limite total disponível (saldo + cheque especial)");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar boleto");
        System.out.println("6 - Verificar uso de cheque especial");
		System.out.println("0 - Sair");
		System.out.print("Escolha uma opção: ");
	}
}
