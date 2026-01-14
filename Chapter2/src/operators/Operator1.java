package operators;

public class Operator1 {

	public static void main(String[] args) {
		// 산술 연산
		System.out.println("*** 산술 연산 ***");
		int n1 = 4;
		int n2 = 7;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println((double)n1 / n2);  //형 변환
		//소수 자리수 처리 : String.format() - 서식 문자(%d-정수, %f-실수)
		System.out.println(String.format("%.2f", (double)n1 / n2)); 
		//printf() 사용
		System.out.printf("%.2f\n", (double)n1 / n2);
		System.out.println(n1 % n2); //나머지
		
		//증감 연산
		System.out.println("*** 증감 연산 ***");
		int a = 99;
		
		System.out.println(a++); //99
		System.out.println(a); //100
		
		System.out.println(++a); //101
		System.out.println(a); //101
		
		System.out.println(a--); //101
		System.out.println(a); //100
		
		System.out.println(--a); //99
		System.out.println(a); //99
	}
}
