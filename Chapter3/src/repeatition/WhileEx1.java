package repeatition;

public class WhileEx1 {
	public static void main(String[] args) {
		// 1 증가(반복)
		int n = 1;
		System.out.println("n = " + n);
		
		n++;  //n += 1;
		System.out.println("n = " + n);
		
		n++;
		System.out.println("n = " + n);
		
		
		// 1~10까지의 합계
		int x = 1;
		int sum = 0;
		
		while(x <= 10) {
			sum += x;
			System.out.println("x=" + x + ", sum=" + sum);
			x++;
		}
		System.out.println("합계 : " + sum);
	}
}
