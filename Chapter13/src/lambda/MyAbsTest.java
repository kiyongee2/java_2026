package lambda;

public class MyAbsTest {

	public static void main(String[] args) {
		//인터페이스형으로 객체 생성
		MyMath math;
		
		//절대값
		math = (x) -> (x < 0) ? -x : x;
		System.out.println("절대값: " + math.myAbs(-4));
	}
}
