package repeatition;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		/*
		    y or Y - "계속 반복합니다."
		    n or N - "반복을 중단합니다."
		    그 이외의 키 - "잘못 눌렀습니다. y or n 키를 입력하세요."
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n): ");
			
			String key = sc.nextLine();
			if(key.equals("y") || key.equals("Y")) {
				System.out.println("계속 반복합니다.");
			}
			else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;
			}
			else {
				System.out.println("잘못 눌렀습니다. y or n 키를 입력하세요.");
			}
		}
		System.out.println("프로그램 종료!");
		
		sc.close();

	}
}
