package arrays;

import java.util.Scanner;

public class CalcScore {
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
			
			switch(menu) {
			case 1:
				System.out.print("학생수> ");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				if(scores != null) {
					for(int i=0; i<scores.length; i++) {
						System.out.print("scores["+ i + "]>");
						scores[i] = scan.nextInt();
					}
				}
				break;
			case 3:
				if(scores != null) {
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores["+ i + "]=" + scores[i]);
					}
				}
				break;
			case 4:
				if(scores != null) {
					int sum = 0;
					double avg;  //평균 점수
					int max;     //최고 점수 
					max = scores[0];  //최대값 설정
					
					for(int i=0; i<scores.length; i++) {
						sum += scores[i];  //합계
						if(scores[i] > max) //점수와 최대값 비교
							max = scores[i];
					}
					avg = (double)sum / scores.length;
					System.out.println("평균 점수: " + avg);
					System.out.println("최고 점수: " + max);
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("올바른 메뉴를 선택하세요");
				break;
			}
		} //while 종료
		scan.close();
	}
}
