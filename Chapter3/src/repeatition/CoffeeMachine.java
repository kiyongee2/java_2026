package repeatition;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		// 커피 자동판매기 프로그램
		int coffee = 5;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("동전을 투입하세요: ");
			int money = sc.nextInt();  //사용자 입력
			
			if(money == 500) {
				System.out.println("커피가 나옵니다.");
				coffee -= 1;
			}else if(money > 500) {
				System.out.println("커피가 나오고 거스름돈 " + (money - 500) + "원을 받습니다.");
				coffee -= 1;
			}else {
				System.out.println("커피가 나오지 않고, 돈이 반환됩니다.");
			}
			
			if(coffee == 0) {
				System.out.println("커피가 모두 소진되어 판매를 중단합니다.");
				break;
			}
		}
		sc.close();
	}
}
