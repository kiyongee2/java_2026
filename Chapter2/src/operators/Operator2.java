package operators;

public class Operator2 {

	public static void main(String[] args) {
		// 비교 연산자
		System.out.println("*** 비교 연산 ***");
		int n1 = 10;
		int n2 = 20;
		
		System.out.println(n1 >= n2); //false
		System.out.println(n1 <= n2); //true
		System.out.println(n1 == n2); //false
		System.out.println(n1 != n2); //true
		
		// 논리 연산자
		System.out.println("*** 논리 연산 ***");
		System.out.println((n1 < n2) && (n1 == n2));  //false
		System.out.println((n1 < n2) || (n1 == n2));  //true
		System.out.println(!(n1 == n2));  //true
	}
}
