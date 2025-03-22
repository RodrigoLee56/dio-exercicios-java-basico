package rbs_banc.model;

/*
 
Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
 	
 	* Consultar saldo
 	* consultar cheque especial
 	* Depositar dinheiro;
 	* Sacar dinheiro;
 	* Pagar um boleto.
 	* Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar

 	* A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
 	* O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
 	* Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
 	* Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
 	* Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

 * */
public class ContaBancaria {
	private double saldo;
	private final double limiteChequeEspecial;
	private double chequeEspecialUsado;

	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;

		// Define o limite do cheque especial com base nas regras fornecidas
		if (saldoInicial <= 500.00) {
			this.limiteChequeEspecial = 50.0;
		} else {
			this.limiteChequeEspecial = saldo * 0.5;
		}

		System.out.println("Conta criada com sucesso!");
		System.out.println("Saldo inicial: R$" + saldoInicial);
		System.out.println("Limite de cheque especial definido como: R$" + limiteChequeEspecial);
	}

	// Método para consultar o saldo
	public void consultarSaldo() {
		System.out.println("Saldo atual: R$" + saldo);
	}

	// Método para consultar o limite de cheque especial
	public void consultarChequeEspecial() {
		double limiteTotal = saldo + limiteChequeEspecial;
		System.out.println("Cheque especial atual: R$" + limiteTotal);
	}

	// Método para depositar dinheiro
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;

			// Verifica se há débito no cheque especial e cobra a taxa de 20%
			if (chequeEspecialUsado > 0) {
				double taxaChequeEspecial = chequeEspecialUsado * 0.2;
				saldo -= taxaChequeEspecial;
				System.out.println("Taxa de 20% sobre o uso do cheque especial cobrada: R$" + taxaChequeEspecial);
				chequeEspecialUsado = 0;
			}

			System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor inválido para depósito.");
		}
	}

	// Método para sacar dinheiro
	public void sacar(double valor) {
		if (valor > 0) {
			if (saldo + limiteChequeEspecial >= valor) {
				saldo -= valor;

				// Atualiza o valor usado do cheque especial, se necessário
				if (saldo < 0) {
					chequeEspecialUsado = Math.abs(saldo);
				} else {
					chequeEspecialUsado = 0;
				}

				System.out.println("Saque de R$" + valor + " realizado com sucesso.");
			} else {
				System.out.println("Saldo insuficiente para realizar o saque.");
			}
		} else {
			System.out.println("Valor inválido para saque.");
		}
	}

	// Método para pagar um boleto
	public void pagarBoleto(double valor) {
		if (valor > 0) {
			if (saldo + limiteChequeEspecial >= 0) {
				saldo -= valor;

				// Atualiza o valor usado do cheque especial, se necessário
				if (saldo < 0) {
					chequeEspecialUsado = Math.abs(saldo);
				} else {
					chequeEspecialUsado = 0;
				}

				System.out.println("Boleto de R$" + valor + " pago com sucesso.");
			} else {
				System.out.println("Saldo insuficiente para pagar o boleto.");
			}
		} else {
			System.out.println("Valor inválido para pagamento do boleto.");
		}
	}
	
    // Método para verificar se a conta está usando cheque especial
	public void verificarUsoChequeEspecial() {
		if (saldo < 0) {
			System.out.println("A conta está usando cheque especial. Saldo negativo: R$" + saldo);
		} else {
			System.out.println("A conta não está usando cheque especial.");
		}
	}
}
