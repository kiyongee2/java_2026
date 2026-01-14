package operators;

public class Operator3 {

	public static void main(String[] args) {
		
		System.out.println("*** 복합 대입 연산 ***");
		int num = 10;
		
		System.out.println(num += 2); //num = num + 2
		System.out.println(num -= 2); //num = num - 2
		System.out.println(num *= 2); //num = num * 2
		System.out.println(num /= 2); //num = num / 2
		
		System.out.println("*** 조건 연산 ***");
		//부모 나이 비교
		int fatherAge = 55;
		int motherAge = 57;
		
		//결과 - true/false
		boolean result1 = (fatherAge > motherAge) ? true : false;
		System.out.println(result1);
		
		//결과 - T/F
		char result2 = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(result2);
	}
}
