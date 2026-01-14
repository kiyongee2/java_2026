package arrays;

import java.util.Scanner;

public class CalcScore0 {
	public static void main(String[] args) {
		boolean run = true;   //스위칭 변수
		int studentNum = 0;   //학생수
		int[] scores = null;  //점수 배열
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("================================================");
			System.out.print("선택> ");
			
			int menu = scan.nextInt(); //menu 입력
			if(menu == 1) {
				System.out.print("학생수> ");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
			}else if(menu == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scan.nextInt();
				}
			}else if(menu == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]=" + scores[i]);
				}
			}else if(menu == 4) {
				//평균, 최고 점수
				int sum = 0;
				double avg = 0.0;
				int max = scores[0]; //최고점수 설정
				
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];  //합계
					if(scores[i] > max)  //점수와 최고점수 비교
						max = scores[i];
				}
				//평균 계산
				avg = (double) sum / scores.length;
				System.out.println("평균 점수: " + avg);
				System.out.println("최고 점수: " + max);
			}else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("메뉴를 잘못 눌렀습니다. 다시 선택하세요.");
			}
		} //while 종료
		scan.close();
	}
}
