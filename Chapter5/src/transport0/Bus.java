package transport0;

public class Bus {
	private int busNumber;  //버스 번호
	private int passenger;  //승객수
	private int money;      //버스의 수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void busInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money + 
				"원이고, 승객 수는 " + passenger + "명 입니다.");
	}
}
