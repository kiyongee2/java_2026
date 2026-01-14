package writer_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {
	public static void main(String[] args) {
		
		try {
			//파일 열기(file 디렉터리는 미리 생성하고, test.txt는 없으면 생성됨)
			Writer writer = new FileWriter("c:/file/text.txt");
			
			//한 개의 문자 쓰기
			writer.write('A');
			writer.write('b');
			
			//숫자 쓰기 - 아스키 코드로 저장
			writer.write(49);  
			
			//배열을 활용하여 문자 쓰기
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			writer.write('\n');  //줄바꿈
			
			//문자열 쓰기
			writer.write("apple");
			writer.write("좋아요");
			
			writer.flush();  //버퍼의 데이터 강제 쓰기
			
			//파일 닫기
			writer.close();  
			
			System.out.println("파일 쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
