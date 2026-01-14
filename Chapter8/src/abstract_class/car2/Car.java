package abstract_class.car2;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void trunOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드
	public final void run() {
		startCar();
		drive();
		stop();
		trunOff();
	}
}
