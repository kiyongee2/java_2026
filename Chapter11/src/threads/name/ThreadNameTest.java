package threads.name;

public class ThreadNameTest {

	public static void main(String[] args) {
		//메인 쓰레드 
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		//작업 스레드
		/*Thread thread0 = new Thread(){

			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		thread0.start();*/
		 
		//멀티 쓰레드 구현
		for(int i = 0; i < 2; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			threadA.start();
		}
		
		
		//작업 스레드 - 스레드 이름 변경
		for(int i = 0; i < 2; i++) {
			Thread chatThread = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			chatThread.setName("chat-thread");
			chatThread.start();
		}
	}
}
