package choice;

public class IfElse1 {

	public static void main(String[] args) {
		// if문
		// 나이가 15세 이상이면 "관람가" 출력
		int age = 16;
		
		if(age >= 15) {
			System.out.println("관람가");
		}
		
		System.out.println("나이는 " + age + "세 입니다.");
		
		
		// if ~ else문
		// 나이가 15세 이상이면 "관람가"이고, 아니면 "관람불가" 출력
		if(age >= 15) {
			System.out.println("관람가");
		}else {
			System.out.println("관람불가");
		}
		
		System.out.println("나이는 " + age + "세 입니다.");
	}
}
