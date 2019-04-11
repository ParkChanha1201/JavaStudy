package ch09;

public class CarMain {
	
	static void drive(Car car) {
		car.move();
	}
	
	public static void main(String[] args) {
		SportCar sc = new SportCar();
		drive(sc);
		
		SportCar2 sc2 = new SportCar2();
		drive(sc2);
	}
}
