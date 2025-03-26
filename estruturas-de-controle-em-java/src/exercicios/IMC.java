package exercicios;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		/*
		 * Escreva um código onde o usuário entra com sua altura e peso, seja feito o
		 * calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de
		 * acordo com o resultado:
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe sua altura: ");
		double altura = scan.nextDouble();

		System.out.print("Informe seu peso: ");
		double peso = scan.nextDouble();
		if (peso > 0 && altura > 0) {
			double imc = peso / (altura * altura);
			// Se for menor ou igual a 18,5 "Abaixo do peso";
			if (imc <= 18.5) {
				System.out.println("Abaixo do peso");

				// se for entre 18,6 e 24,9 "Peso ideal";
			} else if (imc >= 18.6 && imc <= 24.9) {
				System.out.println("Peso ideal");

				// Se for entre 25,0 e 29,9 "Levemente acima do peso";
			} else if (imc >= 25.0 && imc <= 29.9) {
				System.out.print("Levemente acima do peso");

				// Se for entre 30,0 e 34,9 "Obesidade Grau I";
			} else if (imc >= 30.0 && imc <= 34.9) {
				System.out.println("Obesidade Grau I");

				// Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
			} else if (imc >= 35.0 && imc <= 39.9) {
				System.out.println("Obesidade Grau II (Severa)");

				// Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
			} else {
				System.out.println("Obesidade III (Mórbida)");
			}
		} else {
			System.out.println("Informe valores válidos!");
		}

		scan.close();
	}

}
