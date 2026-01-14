package bankapp0;

import java.util.ArrayList;

public class BankAccount {
	private int accountNumber;   //계좌 번호
	private String owner; //계좌주
	private int balance;  //잔고
	ArrayList<Transaction> transactions;
	
	public BankAccount(int accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
		transactions = new ArrayList<>();
	}
	
	//거래 추가
	public void addTransaction(TransactionType type, int amount) {
		Transaction transaction = new Transaction();
		transaction.type = type;
		transaction.amount = amount;
		transactions.add(transaction);
	}
	
	//거래 내역 조회
	public void getTransactionHistory() {
		if(transactions.isEmpty()) {
			System.out.println("거래 내역이 없습니다.");
			return;
		}
		
		for(Transaction transaction : transactions) {
			System.out.println(" | " + (transaction.type == TransactionType.입금 ? "입금" : "출금"));
			System.out.println(" | " + transaction.amount + "원");
		}
	}
	
	public void deposit(int amount) {
		if(amount < 0) {
			System.out.println("유효한 금액을 입력하세요.");
		}
		else {
			this.balance += amount;
			System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " +
			          this.balance + "원");
			
			addTransaction(TransactionType.입금, amount);
		}
	}
	
	public void displayInfo() {
		System.out.println("계좌 정보");
		System.out.println("   계좌 번호: " + accountNumber);
		System.out.println("   계좌주: " + owner);
		System.out.println("   잔고: " + balance);
	}

	
}
