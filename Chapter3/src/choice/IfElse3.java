package choice;

import java.util.Scanner;

public class IfElse3 {
	public static void main(String[] args) {
		//점수에 따른 학점 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		//int score = 87;
		int score = sc.nextInt();  //점수 입력
		char grade;  //학점을 저장할 변수
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		
		System.out.println("학점은 " + grade + "입니다");
		sc.close();  //Scanner 닫기
	}
}
