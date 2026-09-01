package com.example.bank.model;

/**
 * 계좌 클래스 — 콘솔 버전의 Account 와 거의 동일합니다!
 *
 * [학습 포인트]
 * - 핵심 데이터(모델)와 업무 규칙(입금/출금)은 콘솔이든 서버든 똑같습니다.
 * - 즉, 콘솔에서 배운 클래스 개념이 실무 서버에서도 그대로 쓰입니다.
 *   달라지는 건 "요청을 어떻게 받고, 응답을 어떻게 돌려주느냐" 뿐입니다.
 */
public class Account {

    private final String accountNumber;
    private final String owner;
    private long balance;

    public Account(String accountNumber, String owner, long initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금액은 0보다 커야 합니다.");
        }
        this.balance += amount;
    }

    public void withdraw(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("출금액은 0보다 커야 합니다.");
        }
        if (amount > this.balance) {
            throw new IllegalStateException("잔액이 부족합니다. (현재 잔액: " + this.balance + "원)");
        }
        this.balance -= amount;
    }

    // Getter — JSON 응답으로 변환될 때 이 값들이 사용됩니다.
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }
}
