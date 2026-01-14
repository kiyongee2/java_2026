package bankapp1_2;

public class Transaction {
	TransactionType type;  //거래 유형
	int amount;    //거래 금액
	
	public Transaction(TransactionType type, int amount) {
		this.type = type;
		this.amount = amount;
	}
}
