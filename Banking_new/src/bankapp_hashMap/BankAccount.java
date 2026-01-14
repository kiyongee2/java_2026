package bankapp_hashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BankAccount {
	private String accountNumber;
    private String owner;
    private int balance;
    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, String owner) {
        if (!Pattern.matches("^[0-9]{2,4}-[0-9]{2,4}-[0-9]{4,8}$", accountNumber))
            throw new IllegalArgumentException("계좌번호 형식이 잘못되었습니다.");

        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwner() { return owner; }
    public int getBalance() { return balance; }

    public void deposit(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("입금 금액은 0보다 커야 합니다.");
        balance += amount;
        addTransaction(TransactionType.입금, amount, "입금");
    }

    public void withdraw(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("출금 금액은 0보다 커야 합니다.");
        if (amount > balance) throw new IllegalArgumentException("잔액 부족");
        balance -= amount;
        addTransaction(TransactionType.출금, amount, "출금");
    }

    public void transferTo(BankAccount receiver, int amount) {
        if (receiver == null) throw new IllegalArgumentException("이체 대상 계좌가 없습니다.");
        if (amount <= 0) throw new IllegalArgumentException("이체 금액은 0보다 커야 합니다.");
        if (amount > balance) throw new IllegalArgumentException("잔액 부족");
        this.balance -= amount;
        receiver.balance += amount;
        addTransaction(TransactionType.이체, amount, "-> " + receiver.accountNumber);
        receiver.addTransaction(TransactionType.이체, amount, "<- " + this.accountNumber);
    }

    public void addTransaction(TransactionType type, int amount, String note) {
        transactions.add(new Transaction(type, amount, note));
    }

    public void displayInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("예금주: " + owner);
        System.out.println("잔액: " + balance);
        System.out.println("거래내역:");
        for (Transaction t : transactions) {
            System.out.println("  " + t);
        }
    }
}
