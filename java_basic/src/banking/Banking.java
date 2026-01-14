package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("================================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("================================");
			System.out.print("선택>");
			
			int selectNum = sc.nextInt();  //선택 메뉴
			int money = 0;  //입, 출금액
			
			switch(selectNum) {
			case 1:
				System.out.print("예금액>");
				money = sc.nextInt();
				balance += money;
				break;
			case 2:
				System.out.print("출금액>");
				money = sc.nextInt();
				if(money > balance) {
					System.out.println("잔액이 부족합니다.");
				}else {
					balance -= money;
				}
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요");
				break;
			}  //switch
		} //while
		
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
