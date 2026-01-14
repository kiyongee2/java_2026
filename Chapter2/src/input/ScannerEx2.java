package input;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		//짝수, 홀수 판정 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String result;
		
		result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println("결과 : " + result);
		
		sc.close();

	}

}
