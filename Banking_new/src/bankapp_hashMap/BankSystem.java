 package bankapp_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankSystem {
	static Scanner scan = new Scanner(System.in);
    static Map<String, BankAccount> accountMap = new HashMap<>();
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== 은행 계좌 관리 시스템 =====");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 이체");
            System.out.println("5. 계좌 조회");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            switch (scan.nextLine()) {
                case "1" -> createAccount();
                case "2" -> deposit();
                case "3" -> withdraw();
                case "4" -> transfer();
                case "5" -> selectAccount();
                case "0" -> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("계좌번호 입력: ");
        String accNum = scan.nextLine();
        if (accountMap.containsKey(accNum)) {
            System.out.println("이미 존재하는 계좌입니다.");
            return;
        }
        System.out.print("예금주 입력: ");
        String owner = scan.nextLine();

        try {
            BankAccount account = new BankAccount(accNum, owner);
            accountMap.put(accNum, account);
            System.out.println("계좌가 생성되었습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    private static void deposit() {
        System.out.print("계좌번호 입력: ");
        BankAccount account = accountMap.get(scan.nextLine());
        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }
        System.out.print("입금 금액 입력: ");
        int amount = Integer.parseInt(scan.nextLine());
        try {
            account.deposit(amount);
            System.out.println("입금 완료");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    private static void withdraw() {
        System.out.print("계좌번호 입력: ");
        BankAccount account = accountMap.get(scan.nextLine());
        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }
        System.out.print("출금 금액 입력: ");
        int amount = Integer.parseInt(scan.nextLine());
        try {
            account.withdraw(amount);
            System.out.println("출금 완료");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    private static void transfer() {
        System.out.print("보내는 계좌번호 입력: ");
        BankAccount sender = accountMap.get(scan.nextLine());
        if (sender == null) {
            System.out.println("송신 계좌가 존재하지 않습니다.");
            return;
        }
        System.out.print("받는 계좌번호 입력: ");
        BankAccount receiver = accountMap.get(scan.nextLine());
        if (receiver == null) {
            System.out.println("수신 계좌가 존재하지 않습니다.");
            return;
        }
        System.out.print("이체 금액 입력: ");
        int amount = Integer.parseInt(scan.nextLine());
        try {
            sender.transferTo(receiver, amount);
            System.out.println("이체 완료");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    private static void selectAccount() {
        System.out.print("계좌번호 입력: ");
        BankAccount account = accountMap.get(scan.nextLine());
        if (account == null) {
            System.out.println("계좌가 존재하지 않습니다.");
        } else {
            account.displayInfo();
        }
    }
}
