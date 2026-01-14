package chapter2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 짝수/홀수 판정 프로그램
		Scanner sc = new Scanner(System.in);
		
		int num;
		String result;
		
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		System.out.println("입력한 " + num + "은(는) " + result);
		
		sc.close();
	}
}
