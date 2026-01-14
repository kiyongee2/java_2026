package threads.name;

public class ThreadNameRunnable {

	public static void main(String[] args) {
		//메인 스레드
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		//Runnable 구현체 정의
		Runnable task = new Runnable() {

			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				System.out.println(thread.getName() + " 실행");
			}
		};
		
		// 자동 이름 부여되는 스레드 2개
		for(int i = 0; i < 2; i++) {
			Thread thread = new Thread(task);
			thread.start();
		}
		
		// 이름을 직접 지정한 스레드 2개
		for(int i = 0; i < 2; i++) {
			Thread thread = new Thread(task);
			thread.setName("chat-thread" + i);
			thread.start();
		}
	}
}
