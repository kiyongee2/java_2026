package abstract_class.car2;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자동차가 자율 주행합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}
	
	//final이 있으므로 재정의 할 수 없음
	/*public void run() {
		
	}*/
}
