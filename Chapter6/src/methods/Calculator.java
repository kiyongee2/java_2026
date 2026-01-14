package methods;

public class Calculator {
	
	public int add(int n1, int n2) { //더하기
		return n1 + n2;
	}
	
	public int sub(int n1, int n2) { //빼기
		return n1 - n2;
	}
	
	public int mul(int n1, int n2) { //곱하기
		return n1 * n2;
	}
	public double div(int n1, int n2) { //나누기
		//예외 처리
		if (n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
            return Double.NaN; //NaN(Not a Number) 반환
        }
		return (double)n1 / n2;
	}
}
