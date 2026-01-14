package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(
				new FileReader("message.txt"))){
			String str;      //파일에서 읽은 문자열을 저장할 변수
			int lineNo = 1;  //행 번호
			while((str = br.readLine()) != null) {
				System.out.println(lineNo + " " + str);
				lineNo++;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
