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
		}else {
			System.out.println("O carro foi desligado.");
		}
	}
}
