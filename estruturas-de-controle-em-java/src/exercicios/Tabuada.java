package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// Escreva um código onde o usuário entra com um número e seja gerada a tabuada
		// de 1 até 10 desse número;

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um número que será multiplicado: ");
		int numero = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}

		scan.close();
	}

}
