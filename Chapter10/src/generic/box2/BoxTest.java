package generic.box2;

import generic.box.Car;

public class BoxTest {
	public static void main(String[] args) {
		// String type
		Box box1 = new Box();
		box1.set("Good Luck!!");
		
		//String이 Object 보다 작으므로 오류 발생(형변환 필요)
		String msg = (String)box1.get();
		System.out.println(msg);
		
		//클래스 형
		Box box2 = new Box();
		box2.set(new Car("EV4"));
		
		//Car 타입이 Object 타입 보다 작으므로 오류 발생(형변환 필요)
		Car car = (Car)box2.get();
		System.out.println(car);
	}
}
