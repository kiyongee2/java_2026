package arrays2;

public class TwoDimension {

	public static void main(String[] args) {
		// 정수형 2차원 배열
		// 초기화 방법 1
		int[][] a = new int[2][3];
		
		System.out.println(a.length);    //2
		System.out.println(a[0].length); //3
		
		//전체 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//저장
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[1][0] = 4;
//		a[1][1] = 5;
//		a[1][2] = 6;
		
		int k = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				k++;
				a[i][j] = k;
			}
		}
		
		//초기화 방법 2
		/*int[][] a = {
			{1, 2, 3},
			{4, 5, 6}
		};*/
		
		//6에 접근
		System.out.println(a[1][2]);
		
		//전체 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
