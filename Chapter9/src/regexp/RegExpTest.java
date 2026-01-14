package regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		//정규 표현식(Regular Expression)
		//'*' or '+' 는 문자 중복
		
		//a*b 패턴 검사 - a가 0번 이상 반복
		//a+b 패턴 - a가 1번 이상 반복
		Pattern pat = Pattern.compile("a*b"); 
		Matcher m = pat.matcher("aaab"); //a가 없어도 true
		boolean b1 = m.matches();
		
		System.out.println(b1); 
		
		//숫자만 허용하는 패턴 검사
		String pattern = "^[0-9]*$";  
		String str = "abc1031";
		
		boolean b2 = Pattern.matches(pattern, str);
		System.out.println(b2);
		
		//한글 이름과 전화번호 패턴 검사
		String name = "을지문덕장군";
		String tel = "010-1234-5678";
		
		boolean name_check = Pattern.matches("^[가-힣]{2,5}$", name); //한글 2~5자 제한
		boolean tel_check = Pattern.matches("^010[-](\\d{3}|\\d{4})[-]\\d{4}$", tel);
		
		System.out.println("이름 검사: " + name_check);
		System.out.println("전화번호 검사: " + tel_check);
		
		//한글 이름 패턴 유효성 검사
		Scanner sc = new Scanner(System.in);
		System.out.print("한글 이름을 입력하세요: ");
		String inputName = sc.nextLine();

		if (!Pattern.matches("^[가-힣]{2,5}$", inputName)) {
		    System.out.println("올바른 한글 이름이 아닙니다!");
		}
		System.out.println("이름: " + inputName);
		
		sc.close();
	}
}
