package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BufferedReaderTest3 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))){
			String str;           //읽은 문자열 저장
			String[] list = null; //분리된 단어를 저장할 배열
			
			while((str = br.readLine()) != null) {
				list = str.split(" ");
			}
			System.out.println("첫 단어: " + list[0]); //배열의 첫번째 요소
			System.out.println(Arrays.toString(list)); //배열 객체 출력
			
			//랜덤 추출
			int rndIdx = (int)(Math.random() * list.length);  //난수 저장
			System.out.println("단어: " + list[rndIdx]);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
