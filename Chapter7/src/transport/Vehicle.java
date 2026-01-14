package transport;

public class Vehicle {
	String vehicleName;  //차량 이름
	int income;  		 //수입
	int passenger;       //승객수
	
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	//승객 운송
	public void carry(int fare) {
		this.income += fare; //요금
		passenger++;
	}
	
	public void vehicleInfo() {
		System.out.printf("%s의 수입은 %,d원이고, 승객수는 %d명입니다.\n", 
				vehicleName, income, passenger);
	}
}
