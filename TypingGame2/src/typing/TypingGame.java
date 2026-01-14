package typing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("word.txt");
			BufferedReader br = new BufferedReader(fr)){
			// word.txt 파일 읽기
			String str;           //읽은 문자열 저장
			String[] words = null; //분리된 단어를 저장할 배열
			
			while((str = br.readLine()) != null) {
				words = str.split(" ");
			}
			//System.out.println(words[0]);
			//영어 타자 게임 준비
			int n = 1; //문제 번호
			long start, end;  //시작, 종료 시간
			double elapsedTime;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("[타자 게임], 준비되면 엔터!");
			sc.nextLine();
			start = System.currentTimeMillis();  //시작시간
			while(n <= 10) {
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
			end = System.currentTimeMillis();  //종료시간

			elapsedTime = (double)(end - start) / 1000;
			//서식 문자 사용 : %d-정수, %f-실수, %s-문자열
			System.out.printf("게임 소요시간 %.2f초", elapsedTime);
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
