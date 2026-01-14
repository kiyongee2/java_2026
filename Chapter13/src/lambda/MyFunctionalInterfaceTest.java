package lambda;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		//인터페이스의 객체 생성
		MyFunctionalInterface fi; 
		
		//매개변수가 없는 람다식 표현
		fi = () -> {
			String str = "Hello~ lambda";
			System.out.println(str);
		};
		fi.method();
		
		//{} 생략 가능
		fi = () -> System.out.println("Hello~ lambda");
	}
}
