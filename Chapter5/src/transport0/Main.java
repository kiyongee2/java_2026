package transport0;

public class Main {

	public static void main(String[] args) {
		// Person 객체 생성
		Person p1 = new Person("이정후", 10000);
		Person p2 = new Person("최민정", 20000);
		
		//Bus, Taxi 객체 생성
		Bus bus100 = new Bus(100);
		Taxi 카카오T = new Taxi("카카오T");

		int feeOfBus = 1500;  //버스 요금
		int feeOfTaxi = 6500; //택시 요금
		
		//버스 타기
		p1.takeBus(bus100, feeOfBus);
		p2.takeBus(bus100, feeOfBus);
		
		//택시 타기
		p2.takeTaxi(카카오T, feeOfTaxi);
		
		//정보 출력
		p1.personInfo();
		p2.personInfo();
		bus100.busInfo();
		카카오T.taxiInfo();
	}
}
