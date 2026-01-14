package singleton;

public class CarTest {

	public static void main(String[] args) {
		//자동차 회사 객체 생성
		CarFactory factory = CarFactory.getInstance();
		
		//자동차 객체 생성
		Car car1 = factory.createCar();
		Car car2 = factory.createCar();
		Car car3 = factory.createCar();
		
		System.out.println("신차 번호: " + car1.getCarNumber());
		System.out.println("신차 번호: " + car2.getCarNumber());
		System.out.println("신차 번호: " + car3.getCarNumber());
	}
}
