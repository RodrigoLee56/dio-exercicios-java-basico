package app;

import java.util.Scanner;

import car_mechanics.Car;

public class MainCar {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Car car = new Car();

		while (true) {
			menu();

			int option = readIntInput("Escolha uma opção: ", 1, 8);

			switch (option) {
			case 1:
				car.turnOn();
				break;
			case 2:
				car.turnOff();
				break;
			case 3:
				car.accelerate();
				break;
			case 4:
				car.decreaseSpeed();
				break;
			case 5:
				car.checkSpeed();
				break;
			case 6:
				int newGear = readIntInput("Informe a nova marcha (0-6): ", 0, 6);
				car.changeGear(newGear);
				break;
			case 7:
				String side = readStringInput("Para qual lado deseja virar? (esquerda/direita): ");
				car.turn(side);
				break;
			case 8:
				System.out.println("Encerrando o programa...");
				scan.close();
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
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
		System.out.print("");
	}

	private static int readIntInput(String message, int min, int max) {
		while (true) {
			try {

				System.out.println(message);
				int input = Integer.parseInt(scan.nextLine());
				if (input >= min && input <= max) {
					return input;
				} else {
					System.out.println("Valor fora do intervalo permitido. Tente novamente.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Insira um número inteiro.");
			}
		}
	}

	private static String readStringInput(String message) {
		System.out.print(message);
		return scan.nextLine().trim();
	}
}
