package transport;

public class Main {

	public static void main(String[] args) {
		
		Person lee = new Person("이정우", 10000);
		Person shin = new Person("신유진", 2000);
		Bus bus740 = new Bus(740);
		
		//버스 탑승
		lee.takeBus(bus740);
		shin.takeBus(bus740);
		shin.takeBus(bus740); //잔액 부족
		
		//정보 출력
		lee.displayInfo();
		shin.displayInfo();
		bus740.displayInfo();
	}
}
