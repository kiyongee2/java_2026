package exceptions;

public class ThrowExample {
	
	public static void main(String[] args) {
		try {
			//checkAge(3)
			checkAge(10);
		}catch(IllegalArgumentException e) {
			System.out.println("예외 발생 " + e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("예외 발생 " + e.getMessage());
		}
	}
	
	//나이를 검사하는 메서드
	public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("나이는 음수가 될 수 없습니다.");
        } else if (age < 20) {
            throw new ArithmeticException("미성년자는 입장할 수 없습니다.");
        } else {
            System.out.println("입장 가능합니다.");
        }
    }
}
