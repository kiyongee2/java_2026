package member.map;

import java.util.HashMap;
import java.util.Iterator;

import member.Member;

//회원 관리 map 클래스 정의
public class MemberHashMap {
	//Integer - memberId, Member 
	HashMap<Integer, Member> hashMap;
	
	//회원 관리 객체 생성
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//회원 목록
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { //요소를 순회하면서
			int key = ir.next();  //요소의 키를 가져와
			Member member = hashMap.get(key); //키로 member 객체를 생성함
			System.out.println(member);
		}
		System.out.println();
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //외부 입력한 memberId가 있으면
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
}









