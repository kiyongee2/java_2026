package statics;

class Greeting{
	
	public static void sayHello() {
		System.out.println("안녕~");
	}
	
	public static void sayGoodBye() {
		System.out.println("잘가~ ");
	}
}

public class UseGreeting {

	public static void main(String[] args) {
		//static이 있는 메서드는 클래스 이름으로 직접 접근
		//new로 생성하지 않음
		Greeting.sayHello();  
		Greeting.sayGoodBye();
	}
}

