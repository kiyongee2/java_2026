package com.example.bank.service;

import com.example.bank.model.Account;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 은행 업무 로직을 담당하는 서비스 클래스입니다.
 * 콘솔 버전의 Bank 클래스와 하는 일이 똑같습니다.
 *
 * [학습 포인트]
 * - @Service 를 붙이면 Spring 이 이 클래스를 자동으로 만들어(객체 생성)
 *   필요한 곳(Controller)에 넣어줍니다. 이것을 "의존성 주입(DI)"이라 합니다.
 * - 실무에서는 데이터를 이렇게 Map(메모리)이 아니라 DB에 저장합니다.
 *   (지금은 예제라서 서버를 끄면 데이터가 사라집니다.)
 */
@Service
public class BankService {

    private final Map<String, Account> accounts = new LinkedHashMap<>();
    private int sequence = 1;

    // 서버가 켜질 때 샘플 계좌 2개를 미리 만들어 둡니다.
    public BankService() {
        createAccount("홍길동", 100000);
        createAccount("김철수", 50000);
    }

    public Account createAccount(String owner, long initialBalance) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("예금주 이름을 입력해야 합니다.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("초기 잔액은 0원 이상이어야 합니다.");
        }
        String accountNumber = String.format("110-%04d", sequence++);
        Account account = new Account(accountNumber, owner, initialBalance);
        accounts.put(accountNumber, account);
        return account;
    }

    public Account findAccount(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("존재하지 않는 계좌입니다: " + accountNumber);
        }
        return account;
    }

    public Account deposit(String accountNumber, long amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
        return account;
    }

    public Account withdraw(String accountNumber, long amount) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount);
        return account;
    }

    public void transfer(String fromAccount, String toAccount, long amount) {
        if (fromAccount.equals(toAccount)) {
            throw new IllegalArgumentException("같은 계좌로는 이체할 수 없습니다.");
        }
        Account from = findAccount(fromAccount);
        Account to = findAccount(toAccount);
        from.withdraw(amount);
        to.deposit(amount);
    }

    public Collection<Account> getAllAccounts() {
        return accounts.values();
    }
}
