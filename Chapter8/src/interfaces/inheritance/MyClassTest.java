package interfaces.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		//부모 타입으로 객체 생성
		X x = new MyClass();
		x.x();
		
		Y y = new MyClass();
		y.y();
		
		MyInterface iClass = new MyClass();
		iClass.myMethod();
		iClass.x();
		iClass.y();	
	}
}
