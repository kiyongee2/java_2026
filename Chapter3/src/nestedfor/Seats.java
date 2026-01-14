package nestedfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석 열수 계산
		Scanner sc = new Scanner(System.in);
		
		int customer, column, row;
		
		System.out.print("입장객 수 입력: ");
		customer = sc.nextInt();
		
		System.out.print("좌석 열의 수 입력: ");
		column = sc.nextInt();
		
		//row 값 계산
		if(customer % column == 0) {
			row = customer / column;
		}else {
			row = (int)(customer / column) + 1;
		}
		
		//자리 배치(중첩 for문)
		for(int i=0; i<row; i++) {
			for(int j=1; j<=column; j++) {
				int seatNum = i * column + j;
				if(seatNum > customer)
					break;
				System.out.print(seatNum + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
