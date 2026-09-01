package com.example.bank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

/**
 * 업무 로직에서 던진 예외를 잡아서, 사용자에게 깔끔한 에러 응답으로 바꿔주는 곳입니다.
 *
 * [학습 포인트]
 * - 콘솔 버전에서는 try-catch 로 "[오류] ..." 를 출력했습니다.
 * - 서버에서는 @RestControllerAdvice 로 예외를 한곳에서 처리하고,
 *   적절한 HTTP 상태코드(400 등)와 함께 에러 메시지를 JSON 으로 돌려줍니다.
 *   예) 잔액 부족 → 400 Bad Request + {"error":"잔액이 부족합니다..."}
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({IllegalArgumentException.class, IllegalStateException.class})
    public ResponseEntity<Map<String, String>> handleBusinessError(RuntimeException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST) // 400
                .body(Map.of("error", e.getMessage()));
    }
}
