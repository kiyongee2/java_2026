package chapter7;

class Car{
	protected String brand;
	protected int carNumber;
	
	public Car(String brand) {
		this.brand = brand;
	}
}

public class Taxi extends Car{

	private int passenger;
	
	public Taxi(String brand) {
		super(brand);
	}
	
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
	public int getPassenger() {
		return passenger;
	}
}
