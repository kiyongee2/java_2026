package abstract_class.car;

public class CarTest {

	public static void main(String[] args) {
		//Bus 객체 생성
		Bus bus = new Bus();
		
		bus.run();
		bus.refuel();
		bus.takePassenger();
		
		//Truck 객체 생성
		Truck truck = new Truck();
		
		truck.run();
		truck.refuel();
		truck.load();
	}

}
