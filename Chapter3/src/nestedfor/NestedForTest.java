package nestedfor;

public class NestedForTest {

	public static void main(String[] args) {
		// 별찍기
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//1 ~ 25까지 출력
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i*5+j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 1 ~ 22까지 출력
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				int num = i * 5 + j;
				if(num > 22) 
					break;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
