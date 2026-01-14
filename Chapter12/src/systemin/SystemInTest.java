package systemin;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("한 문자를 입력하고 [Enter]를 누르세요.");
		
		try {
			int data = System.in.read();
			System.out.println((char)data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
