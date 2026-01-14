package inheritance.car;

public class EV extends Car{
	private int battery;  //배터리 잔량(0~100%)

	public EV(String brand, String model, int battery) {
		super(brand, model);  //Car의 멤버 변수 상속
		this.battery = battery;
	}
	
	public void charge(int amount) {
		battery += amount;
        if (battery > 100) 
        	battery = 100;
        System.out.println(model + " 충전됨 - 배터리: " + battery + "%");
	}

	/*@Override //메서드 재정의
	public void showInfo() { 
		super.showInfo(); //Car의 showInfo() 상속
		System.out.println("배터리 잔량: " + battery + "%");
	}*/
}
