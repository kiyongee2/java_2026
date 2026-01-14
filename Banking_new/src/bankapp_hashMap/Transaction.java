package bankapp_hashMap;

import java.util.Date;

public class Transaction {
	private TransactionType type;
    private int amount;
    private String note;
    private Date timestamp;

    public Transaction(TransactionType type, int amount, String note) {
        this.type = type;
        this.amount = amount;
        this.note = note;
        this.timestamp = new Date();
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + type + " - " + amount + "원 (" + note + ")";
    }
}
