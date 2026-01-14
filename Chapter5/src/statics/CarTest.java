package statics;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("차량번호: " + car1.getCarNumber());
		System.out.println("차량번호: " + car2.getCarNumber());
		System.out.println("차량번호: " + car3.getCarNumber());
	}
}
