package inheritance.car;

public class Car {
	protected String brand; //브랜드명
	protected String model; //모델명
	protected int speed;    //속도
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.speed = 0;
	}
	
	public void accelerate(int amount) { //가속 메서드
		speed += amount;
		System.out.println(model + " 가속 - 현재 속도: " + speed + "km/h");
	}
	
	public void brake(int amount) { //감속 메서드
		speed -= amount;
		if(speed < 0)
			speed = 0;
		System.out.println(model + " 감속 - 현재 속도: " + speed + "km/h");
	}
	
	public void showInfo() {
		System.out.println("== 자동차 정보 ==");
        System.out.println("제조사: " + brand);
        System.out.println("모델명: " + model);
	}
}
