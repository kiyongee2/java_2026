package exceptions;

public class ThrowsExample {

	public static void main(String[] args) {
		//호출(사용)한 곳에서 예외 처리함.
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("예외 처리: " + e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.Math2");
	}
}
