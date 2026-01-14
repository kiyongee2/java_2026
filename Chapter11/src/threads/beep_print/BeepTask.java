package threads.beep_print;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

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
}
