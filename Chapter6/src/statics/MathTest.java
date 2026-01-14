package statics;


class MyMath{
	//절대값 계산
	public static int abs(int x) {
		if (x < 0) 
			return -x;
		else
			return x;
	}
	
	//거듭제곱 계산
	public static int pow(int x, int y) {
		int num = 1;  //곱하기 초기값 
		
		for(int i=0; i < y; i++) {
			num *= x; //num = num * x;
		}
		
		return num;
	}
}

/*2의 3제곱 
 *   i   num
	i=0, 1 * 2
	i=1, 2 * 2
	i=2, 2 * 2 * 2
*/


public class MathTest {

	public static void main(String[] args) {
		
		//절대값 호출
		int value1 = MyMath.abs(-5);
		System.out.println(value1);
		
		//거듭제곱 호출
		int value2 = MyMath.pow(2, 3);
		System.out.println(value2);
		
		//Math 클래스와 비교
		System.out.println(Math.abs(-5));
		System.out.println((int)Math.pow(2, 3));
	}
}

