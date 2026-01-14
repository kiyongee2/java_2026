package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];
		
		//복사하여 저장
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		//clone()으로 복사
		int[] arr3 = arr1.clone();
		
		for(int i : arr3)
			System.out.print(i + " ");
		
		System.out.println("\n=====================");
		
		//역순으로 복사
		char[] array1 = {'N', 'E', 'T'};
		char[] array2 = new char[3];
		
		//복사
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[2-i];
		}
		
		//출력
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}














