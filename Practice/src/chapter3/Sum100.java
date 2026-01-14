package chapter3;

public class Sum100 {

	public static void main(String[] args) {
		//1부터 더했을때 100을 초과하는 자연수
		int n = 1;
		int sum = 0;
		
		while(true) {
			sum += n;
			if(sum > 100) 
				break;
			n++;
		}
		System.out.println("n = " + n);
		System.out.println("sum = " + sum);
	}
}
