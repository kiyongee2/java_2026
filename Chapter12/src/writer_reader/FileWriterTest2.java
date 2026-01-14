package writer_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest2 {
	public static void main(String[] args) {
		
		try {
			// 데이터 추가(append)로 쓰기 - true 모드
			Writer writer = new FileWriter("c:/file/text.txt", true);
			
			writer.write("\n행운을 빌어요!!");
			
			writer.close();
			
			System.out.println("쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}
