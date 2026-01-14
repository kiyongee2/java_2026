package bankapp0;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		accounts.add(new BankAccount(1001, "이우주", 10000));
		accounts.add(new BankAccount(1002, "정은하", 30000));
		accounts.add(new BankAccount(1003, "한강", 20000));
		
		//입금
		accounts.get(0).deposit(5000);
		accounts.get(1).deposit(10000);
		
		for(BankAccount account : accounts) {
			account.displayInfo();
			account.getTransactionHistory();
		
		}

	}

}
