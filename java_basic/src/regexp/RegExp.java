package regexp;

import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		//전화번호 형식
		String regexp = "(02|010)-\\d{3,4}-\\d{4}";
		String phone = "010-1234-5678";
		
		boolean result = Pattern.matches(regexp, phone);
		//System.out.println(result);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		//계좌 번호
		regexp = "\\d{2}-\\d{3}";
		String account = "12-3456";
		
		boolean result2 = Pattern.matches(regexp, account);
		//System.out.println(result2);
		if(result2) {
			System.out.println("계좌 번호 형식과 일치합니다.");
		}else {
			System.out.println("계좌 번호 형식과 일치하지 않습니다.");
		}
	}

}
