package methods;

public class CalculatorTest {

	public static void main(String[] args) {
		// 계산기 객체 생성
		Calculator calc = new Calculator();
		
		// 인스턴스 메서드 호출
		int add = calc.add(10, 20);
		int sub = calc.sub(10, 20);
		int mul = calc.mul(10, 20);
		double div = calc.div(10, 0);
		
		System.out.println("두 수의 합: " + add);
		System.out.println("두 수의 차: " + sub);
		System.out.println("두 수의 곱: " + mul);
		System.out.println("두 수의 나누기: " + div);
	}
}
