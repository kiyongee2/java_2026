package typing_game;

import java.util.Random;
import java.util.Scanner;
public class TypingGame {
	public static void main(String[] args) {
		String str = "sun moon earth galaxy mountain flower tree bird girl man";
		int n = 1; //문제 번호
		long start, end;  //시작, 종료 시간
		double elapsedTime;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("[타자 게임], 준비되면 엔터!");
		sc.nextLine();
		start = System.currentTimeMillis();  //게임 시작시간
		
		while(n <= 10) {
			//문자열 잘라서 배열 생성 후 랜덤 추출
			String[] words = str.split(" ");
			Random rnd = new Random();
			int rndIdx = rnd.nextInt(words.length);
			String question = words[rndIdx];  
			
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

		elapsedTime = (double)(end - start) / 1000;
		//서식 문자 사용 : %d-정수, %f-실수, %s-문자열
		System.out.printf("게임 소요시간 %.2f초", elapsedTime);
		
		sc.close();
	}
}
