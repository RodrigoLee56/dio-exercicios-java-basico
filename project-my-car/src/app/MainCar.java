package app;

import java.util.Scanner;

import car_mechanics.Car;

public class MainCar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car car = new Car();

		while (true) {
			menu();
			int option = scan.nextInt();
			switch (option) {
			case 1:
				car.turnOn();
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("\n--- Menu ---");
		System.out.println("1. Ligar o carro");
		System.out.println("2. Desligar o carro");
		System.out.println("3. Acelerar");
		System.out.println("4. Diminuir velocidade");
		System.out.println("5. Verificar velocidade");
		System.out.println("6. Trocar marcha");
		System.out.println("7. Virar (esquerda/direita)");
		System.out.println("8. Sair");
		System.out.print("Escolha uma opção: ");

	}

}
