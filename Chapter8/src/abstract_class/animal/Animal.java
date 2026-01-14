package abstract_class.animal;

public abstract class Animal {
	
	String kind; //동물의 종
	
	void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
	//추상 메서드 선언
	public abstract void cry();  

}
