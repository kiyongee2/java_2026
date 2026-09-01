package com.example.bank.dto;

/**
 * 입금/출금 요청 금액을 담는 DTO 입니다.
 * 예) {"amount":50000}
 */
public class AmountRequest {
    private long amount;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
