package threads.beep_print;

import java.awt.Toolkit;

public class BeepPrintRunnable {

	public static void main(String[] args) {
		
		//Runnable 구현체 정의
		Runnable task = new Runnable() {
			@Override
			public void run() {
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
		};
		
		Thread thread = new Thread(task);
		thread.start();
		
		//"띵" 문자 5번 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
