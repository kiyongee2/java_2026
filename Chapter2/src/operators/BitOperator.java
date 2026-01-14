package operators;

public class BitOperator {

	public static void main(String[] args) {
		// 비트 논리 연산자
		int num1 = 5;    //00000101
		int num2 = 10;   //00001010
		int result1, result2;
		
		result1 = num1 & num2; //00000000
		System.out.println(result1); //0
		
		result2 = num1 | num2; //00001111
		System.out.println(result2); //15
		
		//비트 이동 연산자
		int value = 3; //00000011
		int result3, result4;
		
		result3 = value << 2;
		System.out.println(result3); //00001100, 12
		
		result4 = value >> 1;
		System.out.println(result4); //00000001, 1
	}
}
