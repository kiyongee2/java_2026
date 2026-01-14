package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) {
		long start, end;  //시작, 종료시간
		String originFile, copyFile;
		
		originFile = "c:/file/boat.jpg";  //원본 파일
		copyFile = "c:/file/boat2.jpg";   //복사 파일
		//보조 스트림은 기반 스트림을 생성자의 매개변수로 갖는다.
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			start = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			end = System.currentTimeMillis();
			System.out.println("파일 복사 소요시간: " + (end - start) + "ms");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
