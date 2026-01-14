package transport;

public class Person {
	private String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//요금을 내고 교통 수단 이용하기
	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare);
		this.money -= fare;
	}
	
	public void personInfo() {
		System.out.printf("%s의 남은 돈은 %,d원입니다\n", name, money);
	}
}
