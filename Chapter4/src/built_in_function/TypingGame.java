package built_in_function;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		//단어 배열 생성
		String[] words = {"sun", "moon", "earth", "galaxy", "mountain", 
				"flower", "tree", "bird", "girl", "man"};
		int n = 1; //문제 번호
		long start, end;  //시작, 종료 시간
		double elapsedTime;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 타자 게임, 준비되면 엔터!");
		sc.nextLine();
		start = System.currentTimeMillis();  //게임 시작시간
		while(n <= 10) {
			//랜덤 단어 추출
			int idx = (int)(Math.random() * words.length);
			//System.out.println(idx + ":" + words[idx]);
			String question = words[idx];
			
			System.out.println("\n문제 번호 " + n);
			System.out.println(question); //문제 출제
			
			String answer = sc.nextLine(); //사용자 입력
			if(question.equals(answer)) {
				System.out.println("통과!!");
				n++;  //다음 문제 번호
			}else {
				System.out.println("오타! 다시 도전!");
			}
		}
		end = System.currentTimeMillis();  //게임 종료시간
		//System.out.println("게임을 종료합니다.");
		elapsedTime = (double)(end - start) / 1000;
//		System.out.println("게임 소요시간 " + elapsedTime + "초");
		System.out.println("게임 소요시간 " + String.format("%.2f", elapsedTime) + "초");
		//서식 문자 사용 : %d-정수, %f-실수, %s-문자열
		System.out.printf("게임 소요시간 %.2f초", elapsedTime);
		
		sc.close();
	}
}
