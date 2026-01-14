package input;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		//입력 처리 - Scanner 클래스 필요함
		//scanner 객체 생성
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = scanner.nextLine();  //문자열 입력
		System.out.println("당신의 이름은 " + name + "이군요!");
		
		System.out.print("당신의 나이는 몇 살입니까? ");
		int age = scanner.nextInt(); //정수 입력
		System.out.println("당신의 나이는 " + age + "세 이군요!");
		
		scanner.close(); //scanner 닫기
	}
}
