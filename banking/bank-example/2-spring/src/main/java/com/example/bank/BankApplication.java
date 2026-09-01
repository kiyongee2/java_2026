package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 애플리케이션의 시작점(main)입니다.
 *
 * [학습 포인트]
 * - 콘솔 버전에서는 main 이 직접 메뉴를 돌렸지만,
 *   Spring Boot 에서는 main 이 "웹 서버"를 띄웁니다.
 * - 실행하면 내장 톰캣 서버가 8080 포트에서 요청을 기다립니다.
 * - @SpringBootApplication 한 줄이 수많은 설정을 자동으로 처리해 줍니다.
 */
@SpringBootApplication
public class BankApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
        System.out.println(">>> 은행 서버가 시작되었습니다. http://localhost:8080 로 요청하세요.");
    }
}
