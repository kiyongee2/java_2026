package methods;

public class VoidMethods {
	
	//반환 자료형이 없는 함수
	public static void sayHello() {
		System.out.println("Hello~");
	}
	
	//메서드 오버로딩(이름이 같고 매개변수 형태가 다른 것)
	public static void sayHello(String name) {
		System.out.println("Hello~ " + name);
	}

	public static void main(String[] args) {
		//메서드 호출
		sayHello();
		
		sayHello("유빈");
		sayHello("정후");
	}
}
