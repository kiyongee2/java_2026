package org.example.records;

public class MemberTest {
    public static void main(String[] args) {
        MemberResponseDto member =
                new MemberResponseDto(1L, "배소연", "soyeoun@dance.kr", 40);

        // getter 호출
        System.out.println("아이디: " + member.id());
        System.out.println("이름: " + member.username());
        System.out.println("이메일: " + member.email());

        // 커스텀 메서드 호출
        System.out.println("요약 정보: " + member.getSummary());

        // toString() 자동 구현 확인
        System.out.println("토스트링: " + member.toString());
    }
}
