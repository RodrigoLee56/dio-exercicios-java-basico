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
}
