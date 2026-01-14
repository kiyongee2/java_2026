package operators;

public class SwapTest {

	public static void main(String[] args) {
		// 변수의 값 교환하기
		int x = 0;
		int y = 1;
		
		System.out.println("*** 교환 전 ***");
		System.out.println("x = " + x + ", y = " + y);
		
		int temp;  //교환을 위한 임시 변수
		
		//값 교환
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("*** 교환 전 ***");
		System.out.println("x = " + x + ", y = " + y);
	}
}
