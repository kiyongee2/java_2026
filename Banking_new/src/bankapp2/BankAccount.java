package bankapp2;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class BankAccount {
	private String accountNumber; //계좌 번호
	private String owner; //계좌주
	private int balance;  //잔고
	ArrayList<Transaction> transactions;
	
	//계좌 번호 정규식 패턴
	private static final String ACCOUNT_PATTERN = 
						"^[0-9]{2,4}-[0-9]{2,4}-[0-9]{4,8}$";
	
	//생성자
	public BankAccount(String accountNumber, String owner) {
		if(!isValidAccountNumber(accountNumber)) {
			throw new IllegalArgumentException("유효하지 않은 계좌번호 형식입니다.");
		}
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = 0;
		transactions = new ArrayList<>();
	}
	
	//계좌 번호 유효성 검사
	private boolean isValidAccountNumber(String accountNumber) {
		return Pattern.matches(ACCOUNT_PATTERN, accountNumber);
	}
	
	//setter, getter
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//거래 추가
	public void addTransaction(TransactionType type, int amount) {
		Transaction transaction = new Transaction(type, amount);
		transactions.add(transaction);
	}
	
	//거래 내역 조회
	public void getTransactionHistory() {
		if(transactions.isEmpty()) {
			System.out.println("거래 내역이 없습니다.");
			return;
		}
		
		for(Transaction transaction : transactions) {
			String typeStr = (transaction.type == TransactionType.입금 ? "입금" : "출금");
			System.out.println("[" + transaction.getFormattedTimestamp() + "] " +
			                  "| " + typeStr + " | " + transaction.amount + "원");
		}
	}
	
	//계좌 정보
	public void displayInfo() {
		System.out.println("계좌 정보");
		System.out.println("   계좌 번호: " + accountNumber);
		System.out.println("   계좌주: " + owner);
		System.out.println("   잔고: " + balance);
	}
}
