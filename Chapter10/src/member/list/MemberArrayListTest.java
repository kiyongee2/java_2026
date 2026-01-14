package member.list;

import member.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		//회원을 관리할 어레이리스트 생성
		MemberArrayList memberList = new MemberArrayList();
		
		//회원 객체 생성
		Member lee = new Member(1001, "이정후");
		Member shin = new Member(1002, "신유빈");
		Member choi = new Member(1003, "최민정");
		
		//회원 추가
		memberList.addMember(lee);
		memberList.addMember(shin);
		memberList.addMember(choi);
		 
		//회원 출력
		memberList.showAllMember();
		
		//회원 삭제
		memberList.removeMember(1002);
		memberList.removeMember(1004);
		
		memberList.showAllMember();
		
	}

}







