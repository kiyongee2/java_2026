package banking.array;

import java.util.Scanner;

public class BankMain {
	
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("==================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("==================================================");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch(selectNo) {
			case 1:
				createAccount();  //계좌 생성
				break;
			case 2:
				getAccountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	} //main()

	// 계좌 생성
	private static void createAccount() {
		System.out.println("==================================================");
		System.out.println("계좌 생성");
		System.out.println("==================================================");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				System.out.println("중복 계좌입니다. 다시 입력해 주세요");
			}else {
				System.out.print("계좌주: ");
				String owner = scanner.nextLine();
				
				System.out.print("초기 입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				//0번 인덱스 계좌 생성하기
				//accounts[0] = new Account(ano, owner, balance);
				for(int i=0; i < accounts.length; i++) {
					if(accounts[i] == null) {
						accounts[i] = new Account(ano, owner, balance);
						System.out.println("결과: 계좌가 생성되었습니다.");
						break;
					}
				}
				break;
			}
		}
	}
	
	// 계좌 목록
	private static void getAccountList() {
		for(int i=0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				System.out.println("==================================================");
				System.out.println("계좌 번호: " + accounts[i].getAno() + "\t");
				System.out.println("계좌주: " + accounts[i].getOwner() + "\t");
				System.out.println("잔액: " + accounts[i].getBalance());
			}
		}
	}
	
	// 입금
	private static void deposit() {
		System.out.println("==================================================");
		System.out.println("입금");
		System.out.println("==================================================");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				Account account = findAccount(ano);
				
				System.out.print("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				account.setBalance(account.getBalance() + money);
				System.out.println("결과: 정상 처리 되었습니다.");
				break;
			}else {
				System.out.println("결과: 해당 계좌가 없습니다. 다시 입력해주세요");
			}
		}
	}
	
	// 출금
	private static void withdraw() {
		System.out.println("==================================================");
		System.out.println("출금");
		System.out.println("==================================================");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				Account account = findAccount(ano);
				
				while(true) {
					System.out.print("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					
					if(money > account.getBalance()) {
						System.out.println("한도를 초과했습니다. 현재 잔액: " + account.getBalance());
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.println("결과: 정상 처리 되었습니다.");
						break; //정상 처리후 탈출
					}
				}
				break;  //정상 처리후 다시 탈출
			}else {
				System.out.println("결과: 해당 계좌가 없습니다. 다시 입력해주세요");
			}
		}
	}
	
	// 계좌 검색
	private static Account findAccount(String ano) {
		Account account = null;
		
		for(int i=0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno();
				if(dbAno.equals(ano)) {
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}

}









