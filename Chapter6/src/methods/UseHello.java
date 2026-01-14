package methods;

class Hello{
	//메서드 오버로딩(중복)
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	public void sayHello(String name) {
		System.out.println("Hello~ " + name);
	}
}

public class UseHello {

	public static void main(String[] args) {
		//Hello 객체 생성
		Hello greeting = new Hello();
		
		//인스턴스형 메서드 사용
		greeting.sayHello();
		greeting.sayHello("Elsa");
		greeting.sayHello("기용샘");
	}
}
