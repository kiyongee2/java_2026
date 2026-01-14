package map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableTest {

    public static void main(String[] args) {
        // Hashtable 생성
        Hashtable<String, Integer> table = new Hashtable<>();

        // 요소 추가 (put)
        table.put("강감찬", 95);
        table.put("이순신", 90);
        table.put("홍길동", 85);

        // 요소 개수
        System.out.println("요소 수: " + table.size());

        // 값 검색
        System.out.println("이순신의 점수: " + table.get("이순신"));

        // 값 수정
        table.put("홍길동", 88);  // 기존 값 덮어쓰기

        // 요소 출력 (Enumeration 사용)
        Enumeration<String> keys = table.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            Integer value = table.get(key);
            System.out.println(key + " : " + value);
        }

        // 요소 삭제 
        table.remove("강감찬");

        // 삭제 후 출력
        System.out.println("--- 삭제 후 ---");
        for (String key : table.keySet()) {
            System.out.println(key + " : " + table.get(key));
        }
    }
}

