package car_mechanics;

public class Car {
	private boolean carIsOn;
	private int speed;
	private int gear;

	public Car() {
		this.carIsOn = false;
		this.speed = 0;
		this.gear = 0;
	}

	// Método para ligar o carro
	public void turnOn() {
		if (!carIsOn) {
			carIsOn = true;
			System.out.println("O carro foi ligado.");
		} else {
			System.out.println("O carro foi desligado.");
		}
	}

	// Método para desligar o carro
	public void turnOff() {
		if (carIsOn && gear == 0 && speed == 0) {
			carIsOn = false;
			System.out.println("O carro foi desligado.");
		} else if (gear != 0 || speed != 0) {
			System.out.println("Não é possível desligar o carro. "
					+ "Ele deve estar em ponto morto (marcha 0) e com velocidade 0 km/h.");
		} else {
			System.out.println("O carro já está desligado.");
		}
	}

	// Método para acelerar o carro
	public void accelerate() {
		if (carIsOn) {
			if (gear == 0) {
				System.out.println("Não é possível acelerar. O carro está em ponto morto (marcha 0).");
			} else if (speed < getMaxSpeedForGear(gear)) {
				speed++;
				System.out.println("Acelerando... Velocidade atual: " + speed + " km/h");
			} else {
				System.out.println("Velocidade máxima para esta marcha atingida. Troque para uma marcha maior.");
			}
		} else {
			System.out.println("Não é possível acelerar. O carro está desligado.");
		}
	}

	// Método para diminuir a velocidade do carro
	public void decreaseSpeed() {
		if (carIsOn) {
			if (speed > 0) {
				speed--;
				System.out.println("Diminuindo velocidade... Velocidade atual: " + speed + " km/h");
			} else {
				System.out.println("O carro já está parado.");
			}
		} else {
			System.out.println("Não é possível diminuir a velocidade. O carro está desligado.");
		}
	}

	// Método para verificar a velocidade
	public void checkSpeed() {
		System.out.println("Velocidade atual: " + speed + " km/h");
	}

	// Método privado para obter a velocidade máxima permitida para a marcha atual
	private int getMaxSpeedForGear(int gear) {
		switch (gear) {
		case 1:
			return 20;
		case 2:
			return 40;
		case 3:
			return 60;
		case 4:
			return 80;
		case 5:
			return 100;
		case 6:
			return 120;
		default:
			return 0;
		}
	}

	// Método privado para obter a velocidade mínima permitida para a marcha
	private int getMinSpeedForGear(int gear) {
		switch (gear) {
		case 1:
			return 0;
		case 2:
			return 21;
		case 3:
			return 41;
		case 4:
			return 61;
		case 5:
			return 81;
		case 6:
			return 101;
		default:
			return 0;
		}
	}

	// Método privado para validar a troca de marcha com base na velocidade atual
	public boolean isValidGearChange(int newGear) {
		int minSpeed = getMinSpeedForGear(newGear);
		int maxSpeed = getMaxSpeedForGear(newGear);

		return speed >= minSpeed && speed <= maxSpeed;
	}
}
