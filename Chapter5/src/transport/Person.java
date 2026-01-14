package transport;

public class Person {
	private String name; //이름
	private int money;   //가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //bus 인스턴스를 매개 변수로 전달
		if(this.money >= bus.getFee()) {
			bus.take();
			this.money -= bus.getFee();
		}
		else {
			System.out.println("잔액 부족!!");
		}	
	}
	
	public void displayInfo() {
		System.out.println(name + "님의 남은 돈은 " + 
					money + "원 입니다.");
	}
}
