package bankapp1;

import java.util.Scanner;

import bankapp2.BankAccount;

public class BankMain {
	static BankAccount[] accounts = new BankAccount[100];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;
		  
		while(sw) {
			System.out.println("============================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("============================================");
			System.out.print("선택> ");
			
			int selectNum = Integer.parseInt(scan.nextLine()); //메뉴 선택
			
			if(selectNum == 1) {
				createAccount();
			}else if(selectNum == 2) {
				getAccountList();
			}else if(selectNum == 3) {
				deposit();
			}else if(selectNum == 4) {
				withdraw();
			}else if(selectNum == 5) {
				System.out.println("프로그램을 종료합니다.");
				sw = false;
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요");
			}
		} //while() 끝
		scan.close();
	}//main() 닫기

	//계좌 생성
	private static void createAccount() {
		System.out.println("--------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("--------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scan.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scan.nextLine());
		
		//첫번째 계좌 생성
		//accounts[0] = new BankAccount(ano, owner, balance);
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = new BankAccount(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌 목록
	private static void getAccountList() {
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				System.out.print("계좌번호: " + accounts[i].getAno() + "\t");
				System.out.print("계좌주: " + accounts[i].getOwner() + "\t");
				System.out.print("잔고: " + accounts[i].getBalance() + "\n");
			}
		}
	}
	
	//입금
	private static void deposit() {
		System.out.println("--------------------------------------------");
		System.out.println("예금");
		System.out.println("--------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		
		System.out.print("입금액: ");
		int amount = Integer.parseInt(scan.nextLine());
		
		if(findAccount(ano) != null) { //찾는 계좌가 있다면
			BankAccount account = findAccount(ano);
			//예금 = 잔고 + 입금액
			account.setBalance(account.getBalance() + amount);
			System.out.println("결과: 정상 입금되었습니다. 현재 잔액: " + account.getBalance());
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
	}
	
	//출금
	private static void withdraw() {
		System.out.println("--------------------------------------------");
		System.out.println("출금");
		System.out.println("--------------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		
		if(findAccount(ano) != null) {
			BankAccount account = findAccount(ano);
			while(true) {
				System.out.print("출금액: ");
				int amount = Integer.parseInt(scan.nextLine());
				if(amount > account.getBalance()) {
					System.out.println("잔액이 부족합니다. 다시 입력하세요");
				}else {
					//예금 = 잔고 - 입금액
					account.setBalance(account.getBalance() - amount);
					System.out.println("결과: 정상 출금되었습니다. 현재 잔액: " + account.getBalance());
					break;
				}
			}
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
		
		/*System.out.print("출금액: ");
		int amount = Integer.parseInt(scan.nextLine());
		
		if(findAccount(ano) != null) {
			BankAccount account = findAccount(ano);
			//출금 = 잔고 + 출금액
			account.setBalance(account.getBalance() - amount);
			System.out.println("결과: 정상 출금되었습니다. 현재 잔액: " + account.getBalance());
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}*/
	}
	
	//계좌를 검색하는 메서드
	private static BankAccount findAccount(String ano) {
		BankAccount account = null; //BankAccoun 객체 선언
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno(); //이미 저장된 계좌 
				if(dbAno.equals(ano)) { //찾는 계좌와 일치한다면
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}
}











