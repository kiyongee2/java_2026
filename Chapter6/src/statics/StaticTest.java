package statics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StaticTest {
    // 변경 불가능한 상수 맵
    public static final Map<String, String> COUNTRY_CODES;
    
    static {
        // 임시 맵 생성
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("Korea", "KR");
        tempMap.put("United States", "US");
        tempMap.put("Japan", "JP");
        tempMap.put("China", "CN");
        
        // 변경 불가능한 맵으로 변환
        COUNTRY_CODES = Collections.unmodifiableMap(tempMap);
        
        System.out.println("국가 코드 맵 초기화 완료");
    }

    public static void main(String[] args) {
        System.out.println("한국의 국가 코드: " + COUNTRY_CODES.get("Korea"));
    }
}
