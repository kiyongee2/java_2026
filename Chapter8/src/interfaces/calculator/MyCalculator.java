package interfaces.calculator;

public class MyCalculator implements Calculator{

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int subtract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	public int divide(int n1, int n2) {
		//분모가 0인 경우 예외 처리
		if(n2 == 0)
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		return n1 / n2;
	}
}
