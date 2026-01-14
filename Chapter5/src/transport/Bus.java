package transport;

public class Bus {
	
	private int busNumber;  //버스 번호
	private int passenger;  //승객수
	private int money;      //버스의 수입
	private static final int FEE = 1500; //요금(상수)
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take() {
		this.money += FEE;  //요금 증가
		passenger++;        //승객 1명 증가
	}
	
	int getFee() { return FEE;} //요금 반환
	
	public void displayInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money + 
				"원이고, 승객수는 " + passenger + "명 입니다.");
	}
}


