package arrays;

public class BubbleSortTest {

	public static void main(String[] args) {

		int[] arr = {3, 6, 9, 2, 5, 4};
		int i, j, temp;
		
		//오름차순 정렬로 저장하기 - 버블 정렬 방식
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length-1; j++) { //열 종료값-1
				if(arr[j] > arr[j+1]) { //앞 수가 뒷 수보다 크면
					temp = arr[j];      //자리 바꿈
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		/*
		   1행 -- 3, 6, 2, 5, 4, 9
		   2행 -- 3, 2, 5, 4, 6, 9
		   3행 -- 2, 3, 5, 4, 6, 9
		   4행 -- 2, 3, 4, 5, 6, 9
		 */
		
		//변경된 데이터 출력
		for(int a : arr)
			System.out.print(a + " ");
	}
}
