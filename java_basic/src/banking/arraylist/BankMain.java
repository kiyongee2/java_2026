package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BankMain {
	
	static List<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("=============================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 계좌삭제 | 6. 종료");
			System.out.println("=============================================================");
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
				removeAccount();
				break;
			case 6:
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
		System.out.println("                   계좌 생성                        ");
		System.out.println("==================================================");
		
		while(true) {
			System.out.print("계좌 번호(숫자만:00-000-000): ");
			String ano = scanner.nextLine();
			// 계좌 정규 표현식
			String regExp = "\\d{2}-\\d{2}-\\d{3}";
			boolean result = Pattern.matches(regExp, ano);
			if(result) {
				if(findAccount(ano) != null) {
					System.out.println("이미 등록된 계좌입니다. 다시 입력해 주세요");
				}else {
					System.out.print("계좌주: ");
					String owner = scanner.nextLine();
					
					System.out.print("초기 입금액: ");
					int balance = Integer.parseInt(scanner.nextLine());
					
					Account newAccount = new Account(ano, owner, balance);
					accountList.add(newAccount);
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}else {
				System.out.println("잘못된 계좌 형식입니다. 다시 입력해 주세요.");
			}
		}
	}
	
	// 계좌 목록
	private static void getAccountList() {
		for(int i=0; i < accountList.size(); i++) {
			Account account = accountList.get(i);
				System.out.println("==================================================");
				System.out.println("계좌 번호: " + account.getAno() + "\t");
				System.out.println("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance());
			
		}
	}
	
	// 입금
	private static void deposit() {
		System.out.println("==================================================");
		System.out.println("                     입 금                          ");
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
		System.out.println("                     출 금                         ");
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
	
	// 계좌 삭제
	private static void removeAccount() {
		System.out.println("==================================================");
		System.out.println("               계좌 삭제                            ");
		System.out.println("==================================================");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				for(int i=0; i < accountList.size(); i++) {
					//이미 등록된 계좌 가져옴
					String dbAno = accountList.get(i).getAno();
					if(dbAno.equals(ano)) {
						//인덱스로 삭제
						accountList.remove(i);
						//객체로 삭제
						//Account account = accountList.get(i);
						//accountList.remove(account);
						System.out.println("결과: 계좌가 삭제 되었습니다.");
						break;
					}
				}
				break;
			}else {
				System.out.println("결과: 해당 계좌가 없습니다. 다시 입력해주세요");
			}
		}
	}

	// 계좌 검색
	private static Account findAccount(String ano) {
		Account account = null;
		
		for(int i=0; i < accountList.size(); i++) {
			//이미 등록된 계좌 가져옴
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i);
				break;
			}
			
		}
		return account;
	}

}









