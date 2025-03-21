package rbs_banc.model;

/*
 * Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:

    Consultar saldo
    consultar cheque especial
    Depositar dinheiro;
    Sacar dinheiro;
    Pagar um boleto.
    Verificar se a conta está usando cheque especial.

 * */
public class ContaBancaria {
	private double saldo;
	private double limiteCheckEspecial;

	public ContaBancaria() {
	}

	public ContaBancaria(double saldo, double limiteCheckEspecial) {
		super();
		this.saldo = saldo;
		this.limiteCheckEspecial = limiteCheckEspecial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteCheckEspecial() {
		return limiteCheckEspecial;
	}

	public void setLimiteCheckEspecial(double limiteCheckEspecial) {
		this.limiteCheckEspecial = limiteCheckEspecial;
	}

	public void consultarSaldo() {
		System.out.println("Saldo atual: R$" + saldo);
	}

	public void consultarChequeEspecial() {
		System.out.println("Cheque especial atual: R$" + limiteCheckEspecial);
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor inválido para depósito.");
		}
	}

	public void sacar(double valor) {
		if (valor > 0) {
			if (saldo + limiteCheckEspecial >= valor) {
				saldo -= valor;
				System.out.println("Saque de R$" + valor + " realizado com sucesso.");
			} else {
				System.out.println("Saldo insuficiente para realizar o saque.");
			}
		} else {
			System.out.println("Valor inválido para saque.");
		}
	}

	public void pagarBoleto(double valor) {
		if (valor > 0) {
			if (saldo + limiteCheckEspecial >= 0) {
				saldo -= valor;
				System.out.println("Boleto de R$" + valor + " pago com sucesso.");
			} else {
				System.out.println("Saldo insuficiente para pagar o boleto.");
			}
		} else {
			System.out.println("Valor inválido para pagamento do boleto.");
		}
	}

	public void verificarUsoChequeEspecial() {
		if (saldo < 0) {
			System.out.println("A conta está usando cheque especial. Saldo negativo: R$" + saldo);
		} else {
			System.out.println("A conta não está usando cheque especial.");
		}
	}
}
