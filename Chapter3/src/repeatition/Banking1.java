package repeatition;

import java.util.Scanner;

public class Banking1 {

	public static void main(String[] args) {
		// 은행 업무 프로그램 - 예금, 출금, 잔액조회
		boolean run = true; //스위치(토글) 변수
		int balance = 0;    //잔액
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("=======================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액 조회 | 4. 종료");
			System.out.println("=======================================");
			System.out.print("선택> ");
			
			int selectNum = sc.nextInt(); //메뉴 선택
			int amount = 0;  //입금, 출금액
			switch(selectNum) {
			case 1:
				System.out.println("예금액>");
				amount = sc.nextInt();  //입금액 입력
				balance += amount;
				System.out.println("정상 입금되었습니다. 현재 잔액: " + balance );
				break;
			case 2:
				System.out.println("출금액>");
				amount = sc.nextInt();  //출금액 입력
				if(amount > balance) {
					System.out.println("잔액이 부족합니다. 다시 입력해 주세요");
					break;
				}
					
				balance -= amount;
				System.out.println("정상 출금되었습니다. 현재 잔액: " + balance );
				break;
			case 3:
				System.out.println("잔액> " + balance);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;  //스위치(토글) - 값 바꿈
				break;
			default:
				System.out.println("메뉴를 잘못 눌렀습니다. 다시 선택해 주세요.");
				break;
			}
		}
		
		sc.close();
	}
}
