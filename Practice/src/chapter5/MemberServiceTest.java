package chapter5;

public class MemberServiceTest {

	public static void main(String[] args) {
		//memberService 객체 생성
		MemberService memberService = new MemberService();
		
		//로그인을 위해 아이디, 비밀번호 입력
		boolean result = memberService.login("hangang", "k2025");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hangang");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
