package inheritance.car;

public class Main {

	public static void main(String[] args) {
		
		EV myEV = new EV("Kia", "EV6", 50);
		
		myEV.showInfo();
		myEV.accelerate(60);
		myEV.brake(30);
		myEV.charge(60); //최대 100%
		
		myEV.showInfo();
	}

}
