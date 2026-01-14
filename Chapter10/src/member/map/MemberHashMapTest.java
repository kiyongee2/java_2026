package member.map;

import member.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		//MemberHashMap 객체 생성
		MemberHashMap hashMap = new MemberHashMap();
		
		//회원 추가
		hashMap.addMember(new Member(1001, "이정후"));
		hashMap.addMember(new Member(1002, "신유빈"));
		hashMap.addMember(new Member(1003, "최민정"));
		hashMap.addMember(new Member(1003, "임시현")); //중복 발생
		
		//회원 출력
		hashMap.showAllMember();
		
		//회원 삭제
		hashMap.removeMember(1002);
		hashMap.removeMember(1004);
		
		//삭제 후 회원 출력
		hashMap.showAllMember();
	}
}
