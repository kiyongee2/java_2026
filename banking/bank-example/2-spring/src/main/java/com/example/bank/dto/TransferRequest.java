package com.example.bank.dto;

/**
 * 이체 요청 데이터를 담는 DTO 입니다.
 * 예) {"from":"110-0001", "to":"110-0002", "amount":30000}
 */
public class TransferRequest {
    private String from;
    private String to;
    private long amount;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
