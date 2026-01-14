package exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		}
	}
}
