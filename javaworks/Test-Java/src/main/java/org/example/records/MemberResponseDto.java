package org.example.records;

public record MemberResponseDto(
        Long id,
        String username,
        String email,
        int age
) {
    // 1. 컴팩트 생성자를 통한 유효성 검증
    public MemberResponseDto {
        if (age < 0) {
            throw new IllegalArgumentException("나이는 0보다 작을 수 없습니다.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("유효하지 않은 이메일 형식입니다.");
        }
    }

    // 2. 커스텀 인스턴스 메서드 추가 가능
    public String getSummary() {
        return username + " (" + email + ")";
    }
}
