package repeatition;

public class WhileEx2 {

	public static void main(String[] args) {
		// 반복 조건문(while ~ if ~ break)
		// 1~10까지 출력하기
		int n = 1;
		
		while(true) {
			if(n > 10)
				break;
			System.out.println(n);
			n++;
		}
		
		//1~10까지 합계
		int x = 1;
		int sum = 0;
		
		while(true) {
			if(x > 10)
				break;
			sum += x;
			System.out.println("x=" + x + ", sum=" + sum);
			x++;
		}
		System.out.println("합계 : " + sum);
		
	}
}








