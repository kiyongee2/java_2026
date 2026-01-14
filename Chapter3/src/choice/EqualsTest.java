package choice;

public class EqualsTest {

	public static void main(String[] args) {
		
		// 숫자 비교
		int n1 = 100;
		int n2 = 100;
		
		if(n1 == n2){
			System.out.println("두 수가 일치합니다.");
		}else {
			System.out.println("두 수가 일치하지 않습니다.");
		}

		// 문자 비교
		String str1 = "apple";
		String str2 = "banana";
		
		if(str1.equals(str2)) {
			System.out.println("두 단어가 일치합니다.");
		}else {
			System.out.println("두 단어가 일치하지 않습니다.");
		}
	}
}
