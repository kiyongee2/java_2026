package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        // TreeMap 객체 생성 (이름 기준 오름차순 정렬됨)
        Map<String, Integer> map = new TreeMap<>();

        // 요소 추가
        map.put("강감찬", 95);
        map.put("홍길동", 75);
        map.put("이순신", 80);
        map.put("김유신", 90);

        // 요소 개수 출력
        System.out.println("요소 수 - " + map.size() + "개");

        // 요소 검색
        System.out.println("이순신의 점수: " + map.get("이순신"));

        // 값 수정
        map.put("홍길동", 85);  // 기존 값 덮어쓰기

        // 요소 출력 (자동으로 키 기준 정렬)
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // 요소 삭제
        if (map.containsKey("강감찬")) {
            map.remove("강감찬");
        }

        // 최종 요소 출력
        System.out.println("--- 삭제 후 ---");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
