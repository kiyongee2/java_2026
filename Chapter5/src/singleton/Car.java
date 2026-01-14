package singleton;

public class Car {
	
	private static int serialNum = 1000; //정적 변수
	private int carNumber;
	
	public Car() {
		serialNum++;
		carNumber = serialNum;
	}
	
	public int getCarNumber() {
		return carNumber;
	}
}
