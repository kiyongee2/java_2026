package json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
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
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("Java");
		skill.put("C");
		skill.put("C++");
		root.put("skill", skill);
		
		String json = root.toString(); //문자열로 얻기
		System.out.println(json);
		
		try {
			Writer writer = new FileWriter("C:/Jsondata/member.json", 
					Charset.forName("utf-8"));
			writer.write(json);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
