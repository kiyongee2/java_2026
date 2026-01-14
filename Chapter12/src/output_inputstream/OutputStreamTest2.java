package output_inputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamTest2 {

	public static void main(String[] args) {
		//try ~ with ~ resource문 : close() 하지 않아도 됨
		try(OutputStream os = new FileOutputStream("c:/file/file2.bin")){
			//특정 데이터 보내기
			byte[] array = {48, 49, 50, 51, 52};
			
			os.write(array, 1, 3); //1번 인덱스 부터 3개 쓰기 
			
			//문자열로 변환하여 쓰기
			String text = "\nHava a nice day!";
			byte[] textBytes = text.getBytes();
			os.write(textBytes);
			
			os.flush(); //버퍼에 강제 쓰기
			System.out.println("쓰기 완료!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

