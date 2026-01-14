package choice;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("===================================");
			System.out.println("1.예금 | 2.출금 | 3.잔액 조회 | 4.종료");
			System.out.println("===================================");
			System.out.print("선택> ");
			
			int selectNum = sc.nextInt();
			int amount;   //입, 출금액
			
			switch(selectNum){
			case 1:
				System.out.print("입금액> ");
				amount = sc.nextInt();
				balance += amount;
				System.out.println("정상 입금되었습니다. 현재 잔액: " + balance);
				break;
			case 2:
				System.out.print("출금액> ");
				amount = sc.nextInt();
				balance -= amount;
				System.out.println("정상 출금되었습니다. 현재 잔액: " + balance);
				break;
			case 3:
				System.out.println("잔액> " + balance);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 잘못 눌렀습니다. 다시 선택해 주세요.");	
				break;
			}
		}
		sc.close();
	}

}
