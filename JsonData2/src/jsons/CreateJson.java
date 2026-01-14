package jsons;

import org.json.JSONObject;

public class CreateJson {

	public static void main(String[] args) {
		
		//JSON 객체 생성
		JSONObject root = new JSONObject();
		
		//속성 추가
		root.put("id", "sky123");
		root.put("name", "이하늘");
		root.put("age", 28);
		root.put("student", true);
		
		String json = root.toString(); //문자열로 얻기
		System.out.println(json);
		
	}
}
