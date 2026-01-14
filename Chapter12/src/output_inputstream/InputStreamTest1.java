package output_inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:/file/file1.bin");
			int data;
			while((data = is.read()) != -1) {
				System.out.println(data);
				//System.out.println((char)data);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
