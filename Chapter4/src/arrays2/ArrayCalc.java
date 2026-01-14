package arrays2;

public class ArrayCalc {

	public static void main(String[] args) {
		// 배열의 연산
		int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7}};
		int count = 0;  //개수
		int sum = 0;    //합계
		
		//인덱싱
		int x = numbers[1][2];
		System.out.println("numbers[1][2] = " + x);
		
		//전체 출력
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		//합계 및 평균
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
				count++;
			}
		}
		
		System.out.println("개수: " + count);
		System.out.println("합계: " + sum);
		System.out.println("평균: " + ((double)sum / count));
	}
}
