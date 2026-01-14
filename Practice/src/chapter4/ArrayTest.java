package chapter4;

public class ArrayTest {

	public static void main(String[] args) {
		// 1 ~ 10 까지 짝수 저장
		int[] even = {2, 4, 6, 8, 10};
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<even.length; i++) {
			sum += even[i];
		}
		
		avg = (double)sum / even.length;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
	}

}
