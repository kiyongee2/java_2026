package transport0;

public class Person {
	private String name;
	private int money;  //가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus, int fee) {
		bus.take(fee);
		this.money -= fee;
	}
	
	public void takeTaxi(Taxi taxi, int fee) {
		taxi.take(fee);
		this.money -= fee;
	}
	
	public void personInfo() {
		System.out.println(name + "님의 남은 돈은 " + 
					money + "원 입니다.");
	}
}
