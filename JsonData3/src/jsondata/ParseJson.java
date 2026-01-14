package jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJson {
	public static void main(String[] args) {
	    //파일의 내용을 읽어서 출력
		try(BufferedReader br = new BufferedReader(new FileReader("member.json"))){
			String json = br.readLine();
			
			//파싱
			JSONObject root = new JSONObject(json);
			
			//속성 정보
			System.out.println(root.getString("id"));
			System.out.println(root.getString("name"));
			System.out.println(root.getInt("age"));
			System.out.println(root.getBoolean("student"));
			
			//객체(tel)의 속성 정보
			JSONObject tel = root.getJSONObject("tel");
			System.out.println("home: " + tel.getString("home"));
			System.out.println("mobile: " + tel.getString("mobile"));
			
			//배열의 속성 정보
			JSONArray skill = root.getJSONArray("skill");
			System.out.print("skill: ");
			/*for(int i = 0; i < skill.length(); i++) {
				System.out.print(skill.get(i) + ", ");
			}*/
			for(Object ski : skill)
				System.out.print(ski + ", ");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
