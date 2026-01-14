package arrays;

public class ArrayIntTest {

	public static void main(String[] args) {
		// 길이가 4인 정수형 배열 선언
		int[] number = new int[4];
		
		//저장
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		
		System.out.println(number[1]);
		
		//인덱스로 전체 출력
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		//향상 for
		for(int num : number) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n=====================");
		
		//실수 배열의 연산
		double[] data = new double[5];
		double total = 0.0;
		double times = 1.0;
		int size = 0;
		
		//저장
		data[0] = 10.0;
		size++;
		data[1] = 20.0;
		size++;
		data[2] = 30.0;
		size++;
		
		//연산
		for(int i=0; i<data.length; i++) {
			total += data[i];
			times *= data[i];
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<size; i++) {
			total += data[i];
			times *= data[i];
			System.out.print(data[i] + " ");
		}
		System.out.println("\n총합: " + total);
		System.out.println("곱: " + times);
 	}
}










