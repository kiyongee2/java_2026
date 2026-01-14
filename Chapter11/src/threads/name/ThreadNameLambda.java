package threads.name;

public class ThreadNameLambda {

    public static void main(String[] args) {
        // 메인 스레드
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행");

        // 람다 표현식으로 Runnable 정의
        Runnable task = () -> {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " 실행");
        };

        // 자동 이름 부여되는 스레드 2개
        for (int i = 0; i < 2; i++) {
        	Thread thread = new Thread(task);
			thread.start();
        }

        // 이름 지정된 스레드 2개
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(task);
            t.setName("chat-thread-" + i);
            t.start();
        }
    }
}
