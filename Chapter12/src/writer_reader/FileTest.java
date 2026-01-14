package writer_reader;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		//파일 쓰기 전 디렉터리 존재 유무 확인
		File dir = new File("c:/file2");
		if (!dir.exists()) 
			dir.mkdirs();    //디렉터리 생섷
		
		File file = new File("C:/file2/new_file.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		
		//file.delete();  //파일 삭제
	}
}
