package bankapp1_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		try {
		accounts.add(new BankAccount("101-123-4567", "이우주"));
		accounts.add(new BankAccount("102-123-4567", "정은하"));
		accounts.add(new BankAccount("1-123-4567", "한강"));
		
		//입금
		accounts.get(0).deposit(5000);
		accounts.get(1).deposit(10000); 
		
		//출금
		accounts.get(1).withdraw(20000);
		accounts.get(1).withdraw(50000);
		
		//정보 출력
		for(BankAccount account : accounts) {
			account.displayInfo();
			account.getTransactionHistory();
		}
		}catch(IllegalArgumentException e) {
			System.out.println("오류: " + e.getMessage());
		}
	}
}
