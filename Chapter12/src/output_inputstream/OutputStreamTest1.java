package output_inputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest1 {
	public static void main(String[] args) {
		try {
			//바이트 출력 스트림 생성
			OutputStream os = new FileOutputStream("C:/file/file1.bin");
			byte a = 10;
			byte b = 20;
			
			os.write(a); // 바이트 값 10 (0x0A) 기록
			os.write(b); // 바이트 값 20 (0x14) 기록
			
			//배열로 쓰기
			byte[] array = {65, 66, 67};
			os.write(array);
			//os.write(new byte[]{65, 66, 67});  // "ABC" (ASCII 코드)
			
			os.flush();
			os.close();
			System.out.println("쓰기 완료!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
