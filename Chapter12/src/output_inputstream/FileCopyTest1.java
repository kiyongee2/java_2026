package output_inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest1 {
	public static void main(String[] args) {
		String originFile = "c:/file/boat.jpg";
		String copyFile = "c:/file/boat2.jpg";
		long start, end;
		
		try(InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile)){
			start = System.currentTimeMillis(); //시작 시각
			
			while(true) {
				int num = is.read(); //이미지 읽기
				if(num == -1) break;
				os.write(num); //이미지 쓰기
			}
			os.flush();
			end = System.currentTimeMillis();  //종료 시각
			System.out.println("복사 소요 시간: " + (end - start) + "ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
