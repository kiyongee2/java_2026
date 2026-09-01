package com.example.bank.controller;

import com.example.bank.dto.AmountRequest;
import com.example.bank.dto.CreateAccountRequest;
import com.example.bank.dto.TransferRequest;
import com.example.bank.model.Account;
import com.example.bank.service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * 외부(앱/웹)의 요청을 받아서 서비스로 넘기고, 결과를 JSON 으로 돌려주는 창구입니다.
 *
 * [학습 포인트]
 * - 콘솔 버전의 "메뉴 선택(switch문)"이 여기서는 URL 주소로 바뀝니다.
 *     콘솔:  2번 메뉴 → 입금
 *     서버:  POST /accounts/110-0001/deposit → 입금
 * - @RestController: 이 클래스가 웹 요청을 처리하고 결과를 JSON 으로 반환함을 뜻합니다.
 * - @RequestMapping("/accounts"): 이 컨트롤러의 모든 주소는 /accounts 로 시작합니다.
 */
@RestController
@RequestMapping("/accounts")
public class BankController {

    private final BankService bankService;

    // 생성자를 통해 BankService 를 주입받습니다 (의존성 주입, DI).
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    /** 전체 계좌 목록 조회 → GET /accounts */
    @GetMapping
    public Collection<Account> getAllAccounts() {
        return bankService.getAllAccounts();
    }

    /** 특정 계좌 조회(잔액 확인) → GET /accounts/110-0001 */
    @GetMapping("/{accountNumber}")
    public Account getAccount(@PathVariable String accountNumber) {
        return bankService.findAccount(accountNumber);
    }

    /** 계좌 개설 → POST /accounts   body: {"owner":"이영희","initialBalance":30000} */
    @PostMapping
    public Account createAccount(@RequestBody CreateAccountRequest request) {
        return bankService.createAccount(request.getOwner(), request.getInitialBalance());
    }

    /** 입금 → POST /accounts/110-0001/deposit   body:  {"amount":50000} */
    @PostMapping("/{accountNumber}/deposit")
    public Account deposit(@PathVariable String accountNumber, @RequestBody AmountRequest request) {
        return bankService.deposit(accountNumber, request.getAmount());
    }

    /** 출금 → POST /accounts/110-0001/withdraw   body: {"amount":20000} */
    @PostMapping("/{accountNumber}/withdraw")
    public Account withdraw(@PathVariable String accountNumber, @RequestBody AmountRequest request) {
        return bankService.withdraw(accountNumber, request.getAmount());
    }

    /** 이체 → POST /accounts/transfer   body: {"from":"110-0001","to":"110-0002","amount":30000} */
    @PostMapping("/transfer")
    public Map<String, Object> transfer(@RequestBody TransferRequest request) {
        bankService.transfer(request.getFrom(), request.getTo(), request.getAmount());
        return Map.of(
                "message", "이체 완료",
                "from", bankService.findAccount(request.getFrom()),
                "to", bankService.findAccount(request.getTo())
        );
    }
}
