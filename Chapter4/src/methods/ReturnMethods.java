package methods;

public class ReturnMethods {
	
	//반환 자료형이 int 인 경우
	public static int square(int x) {
		return x * x;
	}
	
	//반환 자료형이 int 인 경우
	public static int add(int x, int y) {
		return x + y;
	}
	
	//반환 자료형이 String 인 경우
	public static String message() {
		return "생일 축하해요!!";
	}

	public static void main(String[] args) {
		
		//메서드 호출
		int value1 = square(5);
		System.out.println(value1);
		
		int value2 = add(10, 20);
		System.out.println(value2);
		
		String msg = message();
		System.out.println(msg);
	}
}
