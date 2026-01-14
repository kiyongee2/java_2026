package singleton;

public class CarSingleton {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car car1 = factory.createCar();
		Car car2 = factory.createCar();
		Car car3 = factory.createCar();
		
		System.out.println(car1.getCarNumber());
		System.out.println(car2.getCarNumber());
		System.out.println(car3.getCarNumber());
	}
}
