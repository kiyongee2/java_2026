package threads.beep_print;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		//BeepTask 스레드 객체 생성
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
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
