package com.example.bank.dto;

/**
 * 계좌 개설 요청 데이터를 담는 DTO(Data Transfer Object)입니다.
 *
 * [학습 포인트]
 * - 클라이언트(앱/웹)가 보낸 JSON 을 이 클래스의 객체로 자동 변환해 줍니다.
 *   예) {"owner":"이영희", "initialBalance":30000}  →  CreateAccountRequest 객체
 */
public class CreateAccountRequest {
    private String owner;
    private long initialBalance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(long initialBalance) {
        this.initialBalance = initialBalance;
    }
}
