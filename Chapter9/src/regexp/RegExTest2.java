package regexp;

public class RegExTest2 {

	public static void main(String[] args) {
		//비밀번호 보안 처리
		String password = "P@ssw0rd!";
		
		//replaceAll(정규표현식, 대체할 문자)
		//^ - 부정 문자(아니다)
		String masked = password.replaceAll("[^a-zA-Z0-9]", "*");
		
		System.out.println(masked);  // P*ssw0rd*
		
		//게시글 금칙어 처리
		String text = "안녕@하세요! #스팸";
		// 한글과 공백만 허용
		String filtered = text.replaceAll("[^ㄱ-힣\\s]", "*");  
		
		System.out.println(filtered);  // 안녕*하세요* **
		
		//실습 예제
		String str = "THANK!@YOU%/";
		String res = str.replaceAll("[^ㄱ-하-ㅣ가-힣a-zA-Z0-9]", "*");
		System.out.println(res);
	}
}
