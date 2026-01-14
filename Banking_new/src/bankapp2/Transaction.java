package bankapp2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	TransactionType type;  //거래 유형
	int amount;    //거래 금액
	private LocalDateTime timestamp;
	
	public Transaction(TransactionType type, int amount) {
		this.type = type;
		this.amount = amount;
		this.timestamp = LocalDateTime.now();
	}
	
	public String getFormattedTimestamp() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return timestamp.format(formatter);
	}
}
