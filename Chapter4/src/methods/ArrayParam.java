package methods;

public class ArrayParam {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4};
		double average = getAverage(numbers);
		
		System.out.println("평균: " + average);
	}
	
	public static double getAverage(int[] score) {
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		return (double)sum / score.length;
	}
}
