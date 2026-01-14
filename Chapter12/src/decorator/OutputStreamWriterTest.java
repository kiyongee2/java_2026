package decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
	
	public static void main(String[] args) {
		//보조 스트림은 기반 스트림을 생성자로 함
		//문자 쓰기
		try(OutputStreamWriter osw = 
				new OutputStreamWriter(new FileOutputStream("memo.txt"))){
			osw.write("오늘도 좋은 하루 되세요~");
			System.out.println("memo.txt 파일을 열어 보세요~");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		//문자 읽기
		try(InputStreamReader isr =
				new InputStreamReader(new FileInputStream("memo.txt"))){
			int data;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
