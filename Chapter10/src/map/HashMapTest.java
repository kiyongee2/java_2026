package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//이름과 점수를 저장할 Map 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		//요소 저장
		map.put("강감찬", 95);
		map.put("홍길동", 75);
		map.put("이순신", 80);
		
		//요소의 개수
		System.out.println("요소 수 - " + map.size() + "개");
		
		//요소 검색
		System.out.println("홍길동의 점수: " + map.get("홍길동"));
		
		//요소 수정 - 키는 중복되지 않으므로 기존 값을 덮어 쓴다.
		map.put("이순신", 85);
		
		//반복자 객체로 출력(순서 없이 출력됨)
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//요소 삭제
//		map.remove("고담덕");
		if(map.containsKey("홍길동")) {
			map.remove("홍길동");
		}
		
		//요소의 개수
		System.out.println("요소 수 - " + map.size() + "개");
	}
}
