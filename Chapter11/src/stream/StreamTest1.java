package stream;

import java.util.Arrays;

public class StreamTest1 {

	public static void main(String[] args) {
		//배열로 부터 스트림 얻기
		//문자형 배열
		String[] fruit = {"apple", "banana", "grape"};
		
		for(String fr : fruit)
			System.out.println(fr);
		
		//스트림 얻기
		Arrays.stream(fruit).forEach(fr -> System.out.print(fr + " "));
		System.out.println();
		
		//정수형 배열 처리
		int[] num = {1, 2, 3, 4};
		
		for(int n : num)
			System.out.println(n);
		
		//스트림 얻기
		Arrays.stream(num).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//계산
		int sumVal = Arrays.stream(num).sum();
		int count = (int) Arrays.stream(num).count();
		float avg = (float)sumVal / count;
		
		System.out.println("합계: " + sumVal);
		System.out.println("개수: " + count);
		System.out.println("평균: " + avg);
	}
}
