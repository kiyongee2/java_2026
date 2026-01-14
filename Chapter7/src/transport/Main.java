package transport;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		Person p1 = new Person("이정후", 10000);
		Person p2 = new Person("신유빈", 20000);
		
		//버스와 택시 객체 생성
		Bus bus330 = new Bus("bus330");
		Taxi kakaoT = new Taxi("카카오T");
		
		int fareOfBus = 1500;   //버스 요금
		int fareOfTaxi = 6500;  //택시 요금
		
		//교통 수단 이용하기 - 매개 변수의 다형성
		p1.take(bus330, fareOfBus);
		p2.take(bus330, fareOfBus);
		p2.take(kakaoT, fareOfTaxi);
		
		// 객체의 정보
		p1.personInfo();
		p2.personInfo();
		bus330.vehicleInfo();
		kakaoT.vehicleInfo();
	}
}
