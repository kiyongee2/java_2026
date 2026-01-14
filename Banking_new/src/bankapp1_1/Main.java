package bankapp1_1;

public class Main {

	public static void main(String[] args) {
		//계좌를 저장할 배열 생성
		BankAccount[] accounts = new BankAccount[3];
		
		//계좌 인스턴스 생성
		accounts[0] = new BankAccount("101-1234", "이우주");
		accounts[1] = new BankAccount("102-1234", "정은하");
		accounts[2] = new BankAccount("103-1234", "한강");
		
		//입금
		accounts[0].deposit(10000);
		accounts[1].deposit(20000);
		
		//출금
		accounts[1].withdraw(5000);
		accounts[1].withdraw(30000);
		
		//정보 출력
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				accounts[i].displayInfo();
				accounts[i].getTransactionHistory();
			}
		}
	}
}
