package obj_arrays;

public class ObjectCopy {

	public static void main(String[] args) {
		//객체 배열 생성 방법 3
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		//Book 객체 생성
		array1[0] = new Book(100, "채식주의자", "한강");
		array1[1] = new Book(101, "자바프로그래밍 입문", "박은종");
		array1[2] = new Book(102, "모두의 파이썬", "이승찬");
		
		// array1을 array2에 복사
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];
		}
		
		System.out.println("========== array2 출력 ==========");
		for(int i=0; i<array1.length; i++) {
			array2[i].showBookInfo();
		}
	}
}
