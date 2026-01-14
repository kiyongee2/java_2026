package systemin;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		
		System.out.println("여러 개의 문자를 입력하고 [Enter]를 누르세요.");
		
		try {
			int data;
			while((data = System.in.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*while(true) {
			try {
				int data = System.in.read();
				if(data == -1) break;
				System.out.print((char)data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
	}
}
