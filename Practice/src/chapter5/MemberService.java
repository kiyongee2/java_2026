package chapter5;

public class MemberService {

	//로그인 일치 여부를 반환하는 메서드
	public boolean login(String id, String password) {
		if(id.equals("hangang") && password.equals("k2025"))
			return true;
		return false;
	}

	//로그아웃을 실행하는 메서드 
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
