package threads.beep_print;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		//메인 스레드 - 작업 스레드가 순차적으로 실행됨
		//"띵" 문자 5번 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//"띵" 소리 5번 재생하기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 1; i <= 5; i++) {
			toolkit.beep(); //"띵" 소리 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
