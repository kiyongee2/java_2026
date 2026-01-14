package constant;

public class FinalEx1 {

	public static void main(String[] args) {
		//상수 사용하기
		final int MIN_NUM = 0;
		final int MAX_NUM = 100;
		
		//MAX_NUM = 1000;  수정할 수 없음
		
		System.out.println(MIN_NUM);
		System.out.println(MAX_NUM);
		
		//원의 넓이 계산하기
		final double PI = 3.1415;
		int radius = 5;
		double area = PI * radius * radius;
		
		//System.out.println("원의 넓이 : " + area);
		//서식 문자 - %d(정수), %f(실수), %s(문자열)
		System.out.printf("원의 넓이: %.3f", area);
	}
}
