package choice;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석 열수 계산
		Scanner sc = new Scanner(System.in);
		
		int customer, column, row;
		
		System.out.print("입장객 수 입력: ");
		customer = sc.nextInt();
		
		System.out.print("좌석 열의 수 입력: ");
		column = sc.nextInt();
		
		if(customer % column == 0) {
			row = (int)(customer / column);
		}else {
			row = (int)(customer / column) + 1;
		}
		
		System.out.println(row + "줄이 필요합니다.");
		
		sc.close();
	}
}
