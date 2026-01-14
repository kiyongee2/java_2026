package wrapper_class;

public class IntegerTest {

	public static void main(String[] args) {
		//Integer형 > int형(자동 형변환)
		Integer num1 = 100;  
		int num2 = 200;
		int sum;
		
		//intValue() -> Integer형을 int형으로 변환함
		sum = num1.intValue() + num2;
		System.out.println(sum);
		
		//valueOf() -> 정수나 문자열을 Integer 클래스로 변환함
		Integer n1 = Integer.valueOf("100");
		System.out.println(n1);
		 
		//parseInt() -> 매개로 전달된 문자열을 정수형으로 변환
		int n2 = Integer.parseInt("200");
		System.out.println(n2);
		
		//parseDouble() -> 문자열을 실수형으로 변환함
		double dNum = Double.parseDouble("1.609");
		System.out.println(dNum);
	}
}
