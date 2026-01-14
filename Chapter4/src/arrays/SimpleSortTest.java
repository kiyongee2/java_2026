package arrays;

public class SimpleSortTest {

	public static void main(String[] args) {
		// 단순 정렬
		int[] arr = {3, 6, 9, 2, 5, 4};
		int i, j, temp;
		
		for(i = 0; i < arr.length - 1; i++) {
			for(j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int a : arr)
			System.out.print(a + " ");

	}

}
