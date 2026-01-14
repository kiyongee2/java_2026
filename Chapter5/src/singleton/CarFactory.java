package singleton;

public class CarFactory {
	private static CarFactory instance;
	
	private CarFactory() {};
	
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		
		return instance;
	}
	
	//차를 생성하는 메서드 정의
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}
