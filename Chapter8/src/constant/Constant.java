package constant;

public class Constant {
	
	static int num = 10;   //전역 변수
	static final int NUM = 100; //상수 선언
	
	public static void main(String[] args) {

		num = 20;
	    //NUM = 1000; //수정 불가
		
		System.out.println(num);
		System.out.println(NUM);
	}
}
